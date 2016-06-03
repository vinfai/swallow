package com.cainiao.patterns.decorate;

import java.io.*;

/**
 *  װ��ģʽ����̬��Ӷ���Ĺ���.
 *  ��̬�ĸ�һ���������һЩ�����ְ��<br/>?
 *  �ŵ㣺װ����ͱ�װ���඼���Զ�����չ���������໥��ϣ�װ��ģʽ�Ǽ̳й�ϵ��һ�����������װ��ģʽ���Զ�̬����չһ��ʵ����Ĺ��ܡ�<br/>?
 *  ʹ�ó�����1.��Ҫ��չһ����Ĺ��ܣ����һ�������Ӹ��ӹ��ܡ�<br/>?
 *  ????????2.��Ҫ��̬�ظ�һ���������ӹ��ܣ���Щ���ܿ����ٶ�̬�س���.<br/>?
 *          3.��ҪΪһ������и�װ���װ����<br/>?
 *
 *  @see BufferedReader
 *  @see FileReader
 *  Created by vinfai on 2016/4/28.
 *
 */
public class DecorateTest {

    public static void main(String[] args) {
       //java io pattern
        /*BufferedReader bufferedReader = null;
        try {
            //decorate pattern
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("F:\\ftp\\Movie_2016-04-25")));
            String line = null;
            while ((line=bufferedReader.readLine())!=null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e1){
            e1.printStackTrace();
        }finally {
            if(bufferedReader!=null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }*/


        ChineseGirl girl = new ChineseGirl();
        //TODO �о���̫����
        Art artGirl = new Art(girl);
        System.out.println(artGirl.getDescription());
        artGirl.draw();//������
        Sience sienceGirl = new Sience(girl);
        sienceGirl.doSinence();
        System.out.println(sienceGirl.getDescription());
    }
}
