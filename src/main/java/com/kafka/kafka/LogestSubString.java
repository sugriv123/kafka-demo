package com.kafka.kafka;

import java.util.HashSet;
import java.util.Set;

public class LogestSubString {
//abcadmnbad
    public static int getLogestSubString(String name){
        int start=0;
        int end=0;
        int maxLength=0;
       char[] ch = name.toCharArray();
        Set s=new HashSet();
       while(end<ch.length){
           if(!s.contains(ch[end])){
               s.add(ch[end]);
               end++;
               maxLength=Math.max(maxLength,s.size());
           }else {
               s.remove(ch[start]);
               start++;
           }
       }
return maxLength;
    }

    public static void main(String[] args) {

      int length= LogestSubString.getLogestSubString("abcadamdoonbobad");
        System.out.println(length);
    }
}
