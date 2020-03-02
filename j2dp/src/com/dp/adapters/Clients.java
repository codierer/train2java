package com.dp.adapters;

/**
 * @author zac
 * @description:
 * @data 2020 2020/2/29 22:15
 */
public class Clients {

    public static void main(String[] args){
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request();

        //Adaptee
    }
}
