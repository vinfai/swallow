package com.cainiao.io;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * randomAccessFile ������д����
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
     * �����ȡ�ļ�
     * @param filename �ļ�
     * @param seek ָ��λ��
     * @return ��ȡ������
     */
    public static String readFile(String filename,long seek){
        //ʹ��stringbuilder ����stringBuffer �������ڷǳ�Ա���������̰߳�ȫ����!
        StringBuilder sb = new StringBuilder(1000);
        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile(filename,"r");
            long point = raf.getFilePointer();
            System.out.println("current pointer :"+point);
            raf.seek(seek);
            byte[] buffer = new byte[100];
            int readByte;//����Ҫ��ʼ����
            while ( (readByte = raf.read(buffer))>0){
                String t = new String(buffer,0,readByte);
                System.out.println(t);
                sb.append(t);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //��Ҫ�رգ�
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
                //�ļ�ĩβ׷��
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
