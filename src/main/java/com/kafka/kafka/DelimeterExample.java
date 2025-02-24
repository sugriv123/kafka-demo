package com.kafka.kafka;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DelimeterExample {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        List<String> list=List.of("vikas_1","ravi_2","dinesh_3");

            for(String s:list){
             String[] ss=   s.split("_");
             for(String str:ss){
                 map.put(ss[0],ss[1]);
             }
            }

        System.out.println(map);

    }
}
