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
        System.out.println( "Hello World!" );
        Random random = new Random(100);
        System.out.println(Math.abs(random.nextInt()));

    }

}
