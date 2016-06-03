package com.cainiao.algorithm.lru;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author vinfai
 * @since 2016/5/31
 */
public class LRUTest {
    public static void main(String[] args) {
        LRUCache<String,String> cache = new LRUCache<>(3);

        cache.put("a","a");
        cache.put("c","c");
        cache.put("b","b");
        cache.get("a");
        print(cache);
        cache.get("b");
        cache.get("b");
        cache.get("b");
        print(cache);



    }

    public static void print(LinkedHashMap<String, String> cache){
        Iterator<Map.Entry<String,String>> iter = cache.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry<String,String> entry = iter.next();
            System.out.println(entry.getKey()+" --> "+entry.getValue());
        }
        System.out.println("--------- end ------------");
    }
}
