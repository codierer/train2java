package com.extend;

/**
 * @author zac
 * @description:
 * @data 2020 2020/2/28 12:06
 */
public class SubClass extends SuperClass {

    public static void main(String[] args){
        new SuperClass();
    }

    public void addSub(){
        System.out.println("add function with sub");
    }
}
