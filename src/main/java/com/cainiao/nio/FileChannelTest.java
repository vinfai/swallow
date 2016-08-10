package com.cainiao.nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/**
 * FileChannel 使用实例
 * @author vinfai
 * @since 2016/7/18
 */
public class FileChannelTest {

    public static void main(String[] args) {
        String fromFile = "F:\\test\\test.txt";
        String toFile = "F:\\test\\newTest.txt";
     /*   File f = new File(toFile);
        if(!f.exists()){
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
//        transferFrom(fromFile,toFile);
        transferTo(fromFile,toFile);
    }

    /**
     * 文件直接的通过channel相互copy
     * @param srcFile
     * @param targetFile
     */
    public static void transferFrom(String srcFile,String targetFile){

        try {
            RandomAccessFile fromFile = new RandomAccessFile(srcFile,"rw");
            RandomAccessFile toFile = new RandomAccessFile(targetFile,"rw");
            FileChannel fromChannel = fromFile.getChannel();
            FileChannel toChannel = toFile.getChannel();
            System.out.println(fromChannel.size());
            toChannel.transferFrom(fromChannel,0,fromChannel.size());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void transferTo(String srcFile,String targetFile){
        try {
            RandomAccessFile fromFile = new RandomAccessFile(srcFile,"rw");
            RandomAccessFile toFile = new RandomAccessFile(targetFile,"rw");
            FileChannel fromChannel = fromFile.getChannel();
            FileChannel toChannel = toFile.getChannel();
            fromChannel.transferTo(0,fromChannel.size(),toChannel);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
