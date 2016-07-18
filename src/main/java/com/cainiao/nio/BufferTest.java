package com.cainiao.nio;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author vinfai
 * @since 2016/7/18
 */
public class BufferTest {
    public static void main(String[] args) {
        RandomAccessFile accessFile = null;
        try {
            accessFile = new RandomAccessFile("F:\\test\\test.txt","r");
            FileChannel inChannel = accessFile.getChannel();
            //allocate buffer
            ByteBuffer buffer = ByteBuffer.allocate(48);
            int bytes = inChannel.read(buffer);
            while(bytes!=-1){
                buffer.flip();//ÇÐ»»µ½¶ÁÄ£Ê½
                while (buffer.hasRemaining()){
                    System.out.println((char)buffer.get());
                }
                buffer.clear();
                bytes = inChannel.read(buffer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                accessFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
