package com.extend;

import com.extend.SubClass;
import com.extend.SubSubClass;

/**
 * @author zac
 * @description:
 * @data 2020 2020/2/28 12:08
 */
public class SubLab {

    //public SubClass subClass;

    public static void main(String[] args){
        SubClass subClass = new SubClass();
        subClass.add();
        subClass.addSub();

        SubSubClass subSubClass = new SubSubClass();
        subSubClass.addSub();
        subSubClass.add();

    }


    public void run(){}

    protected void run(String str){
        System.out.printf(str);
    }
    //protected static void run(String str){}

    private static void run(Integer i){}
}
