package com.cainiao;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
        Random random = new Random(100);
        System.out.println(Math.abs(random.nextInt()));
        //  JDK7 �����شӷ������Ƴ����ڶѿռ��У�ָ��ָ���һ�δ����Ķ���λ��.
        String str = new StringBuilder().append("hello").append("world").toString();
        String helloWorld = "helloworld";
        String str2 = str.intern();

        System.out.println(str==str2);
        System.out.println(helloWorld==str2);
//        System.out.println(str==helloWorld);
    }

}
