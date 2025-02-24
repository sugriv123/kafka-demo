package com.kafka.kafka;

public class SingletonClass{

    private static SingletonClass singletonClass;

    private SingletonClass() throws Exception {
if(singletonClass!=null)
        throw new Exception("Object already existing...");

    }

    public static SingletonClass getInstance() throws Exception {
        if(singletonClass==null){
            singletonClass=new SingletonClass();
        }
        return singletonClass;
    }



    public static void main(String[] args) throws Exception {
       SingletonClass s= SingletonClass.getInstance();
        SingletonClass s1= SingletonClass.getInstance();
        SingletonClass s2= SingletonClass.getInstance();
        SingletonClass s3= SingletonClass.getInstance();
        System.out.println(s.hashCode()+" "+s1.hashCode()+" "+s2.hashCode());



    }
}
