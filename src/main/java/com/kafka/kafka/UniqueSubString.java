package com.kafka.kafka;

public class UniqueSubString {


    // "abcdabcdefabc"

    public static void main(String[] args) {

int count=97;
        String subString="abcdabcdefabc";
        char[] c=new char[subString.length()];
      char[] chars=  subString.toCharArray();
       // System.out.println(chars[0]+1);

      for(int i=0;i<chars.length;i++){
          for(int j=i;j<chars.length;i++){

              if(chars[j]==count){
                  c[j]=chars[j];
                  count++;
              }

          }
          System.out.println(c[i]);
      }


    }



}

