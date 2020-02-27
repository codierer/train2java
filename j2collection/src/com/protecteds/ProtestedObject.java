package com.protecteds;

/**
 * @author zac
 * @description:
 * @data 2020 2020/2/27 17:47
 */
public class ProtestedObject {

    protected static String s = "str";

    protected ProtestedObject(){
        System.out.println("Protected Object");
    }

    protected void run(){
        System.out.println("Protected run function");
    }
}
