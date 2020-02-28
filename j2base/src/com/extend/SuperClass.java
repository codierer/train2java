package com.extend;

/**
 * @author zac
 * @description:
 * @data 2020 2020/2/28 12:02
 */
public class SuperClass {


    public SuperClass(){
        System.out.println("super class function");
    }

    public SuperClass(String str){
        System.out.println("super class function with str: "+str);
    }

    protected void add(){
        System.out.println("add function");
    }


}
