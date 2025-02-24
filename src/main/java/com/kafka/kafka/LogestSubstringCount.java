package com.kafka.kafka;

import org.springframework.web.servlet.tags.form.SelectTag;

import java.util.HashSet;
import java.util.Set;

public class LogestSubstringCount {

    public static void main(String[] args) {
       int len= LogestSubstringCount.getLogestSubstring("welecoeme");
        System.out.println(len);
    }

    private static int getLogestSubstring(String name) {
        int start=0,end=0,maxLength=0;
        Set set=new HashSet();
        char[] ch=name.toCharArray();
        while(end<ch.length){
            if(!set.contains(ch[end])){
                set.add(ch[end]);
                end++;
             maxLength=   Math.max(maxLength,set.size());
            }else{
                set.remove(ch[start]);
                start++;
            }
        }
        return maxLength;
    }
}
