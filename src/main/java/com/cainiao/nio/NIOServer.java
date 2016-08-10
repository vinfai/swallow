package com.cainiao.nio;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

/**
 * http://weixiaolu.iteye.com/blog/1479656
 * nio.selector 使用示例
 * @author vinfai
 * @since 2016/7/19
 */
public class NIOServer {

    public static void main(String[] args) throws  Exception{
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.socket().bind(new InetSocketAddress(9999));
        serverSocketChannel.configureBlocking(false);
        Selector selector = Selector.open();
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

        while (true){
            int num = selector.select();
            System.out.println(num);
            Iterator<SelectionKey> iter = selector.selectedKeys().iterator();
            while (iter.hasNext()){
                SelectionKey key = iter.next();
                iter.remove();
                if(key.isAcceptable()){
                    ServerSocketChannel serverChannel = (ServerSocketChannel) key.channel();
                    SocketChannel channel = serverChannel.accept();
                    channel.configureBlocking(false);
                    channel.write(ByteBuffer.wrap(new String("连接服务器成功").getBytes()));
                    channel.write(ByteBuffer.wrap("\r".getBytes()));
                    channel.register(selector,SelectionKey.OP_READ);

                }else if(key.isReadable()){
                    SocketChannel channel = (SocketChannel) key.channel();
                    ByteBuffer buffer = ByteBuffer.allocate(10);
                   /* int i = channel.read(buffer);
                    while(i!=-1){
                        buffer.flip();
                        while (buffer.hasRemaining()){
                            buffer.get
                        }
                    }*/
                    channel.read(buffer);
                    byte[] data = buffer.array();
                    String msg = new String(data).trim();
                    System.out.println("服务端收到信息："+msg);
                    ByteBuffer outBuffer = ByteBuffer.wrap(msg.getBytes());
                    channel.write(outBuffer);// 将消息回送给客户端
                }else if(key.isWritable()){
                    System.out.println(key.isWritable()+" writable");
                }
            }
        }
    }

}
