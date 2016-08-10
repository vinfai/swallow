package com.cainiao.nio;

import sun.org.mozilla.javascript.internal.ast.WhileLoop;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

/**
 * @author vinfai
 * @since 2016/7/19
 */
public class NIOClient {

    public static void main(String[] args) {
        try {
            Selector selector = Selector.open();
            SocketChannel channel = SocketChannel.open();
            channel.configureBlocking(false);
            channel.register(selector, SelectionKey.OP_CONNECT|SelectionKey.OP_READ|SelectionKey.OP_WRITE);
            channel.connect(new InetSocketAddress("127.0.0.1",9999));
            while (true){
                selector.select();
                Iterator<SelectionKey> iter = selector.selectedKeys().iterator();
                while(iter.hasNext()){
                    SelectionKey key = iter.next();
                    iter.remove();
                    if(key.isConnectable()){
                        SocketChannel sc = (SocketChannel)key.channel();
                        // 如果正在连接，则完成连接
                        if(sc.isConnectionPending()){
                            sc.finishConnect();

                        }
                        //在这里可以给服务端发送信息哦
                        sc.write(ByteBuffer.wrap(new String("向服务端发送了一条信息").getBytes()));
                        //在和服务端连接成功之后，为了可以接收到服务端的信息，需要给通道设置读的权限。
                        sc.register(selector, SelectionKey.OP_READ);
                    }else if(key.isReadable()){
                       SocketChannel sc = (SocketChannel) key.channel();
                        ByteBuffer buffer = ByteBuffer.allocate(10);
                        channel.read(buffer);
                        byte[] data = buffer.array();
                        String msg = new String(data).trim();
                        System.out.println("client收到信息："+msg);
                        ByteBuffer outBuffer = ByteBuffer.wrap(msg.getBytes());
                        sc.write(outBuffer);
                        sc.write(ByteBuffer.wrap("222".getBytes()));
                        System.out.println(key.isReadable()+" client readable");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
