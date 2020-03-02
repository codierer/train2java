package com.abstracts;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zac
 * @description:
 * @data 2020 2020/2/28 22:27
 */
public abstract class AbstractClass {

    private String str;

    private Integer i;

    public AbstractClass(){}

    public void run(){
        System.out.println("run");
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
    }
}
