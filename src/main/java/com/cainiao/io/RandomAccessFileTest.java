package com.cainiao.io;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * randomAccessFile 基本读写操作
 * @author vinfai
 * @since 2016/6/3
 */
public class RandomAccessFileTest {

    public static void main(String[] args) {
        String filename = "F:\\test\\domain\\Session.java";
        writeFile(filename,-1,"helloworld.gagagagagaga");
        readFile(filename,2000L);
    }

    /**
     * 随机读取文件
     * @param filename 文件
     * @param seek 指针位置
     * @return 读取的内容
     */
    public static String readFile(String filename,long seek){
        //使用stringbuilder 代替stringBuffer ，方法内非成员变量，无线程安全问题!
        StringBuilder sb = new StringBuilder(1000);
        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile(filename,"r");
            long point = raf.getFilePointer();
            System.out.println("current pointer :"+point);
            raf.seek(seek);
            byte[] buffer = new byte[100];
            int readByte;//不需要初始化？
            while ( (readByte = raf.read(buffer))>0){
                String t = new String(buffer,0,readByte);
                System.out.println(t);
                sb.append(t);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //需要关闭？
            if(raf!=null){
                try {
                    raf.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return sb.toString();
    }


    public static void writeFile(String filename,long seek,String content){
        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile(filename,"rw");
            if(seek<0L){
                //文件末尾追加
                raf.seek(raf.length());
            }else{
                raf.seek(seek);
            }
            raf.write(content.getBytes("GBK"),0,content.length());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(raf!=null){
                try {
                    raf.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
