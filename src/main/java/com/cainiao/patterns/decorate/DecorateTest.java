package com.cainiao.patterns.decorate;

import java.io.*;

/**
 *  装饰模式：动态添加额外的功能.
 *  动态的给一个对象添加一些额外的职责。<br/>?
 *  优点：装饰类和被装饰类都可以独立发展，而不会相互耦合；装饰模式是继承关系的一个替代方案；装饰模式可以动态地扩展一个实现类的功能。<br/>?
 *  使用场景：1.需要扩展一个类的功能，或给一个类增加附加功能。<br/>?
 *  ????????2.需要动态地给一个对象增加功能，这些功能可以再动态地撤销.<br/>?
 *          3.需要为一批类进行改装或加装功能<br/>?
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
        //TODO 感觉不太合理
        Art artGirl = new Art(girl);
        System.out.println(artGirl.getDescription());
        artGirl.draw();//新能力
        Sience sienceGirl = new Sience(girl);
        sienceGirl.doSinence();
        System.out.println(sienceGirl.getDescription());
    }
}
