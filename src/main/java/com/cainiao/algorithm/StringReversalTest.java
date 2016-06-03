package com.cainiao.algorithm;

import com.google.common.base.Strings;

/**
 * �õݹ�ʵ��һ���ַ����ķ�ת
 * @author vinfai
 * @since 2016/5/12
 */
public class StringReversalTest {

    public static void main(String[] args) {
//        "1234567" --> 7654321
        String str = reverse("1234567");
        System.out.println(str);
    }

    public static String reverse(String str){
        if (Strings.isNullOrEmpty(str)) return str;//guva
        return reverse(str.substring(1))+str.charAt(0);
    }
}
