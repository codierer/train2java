package com.dp.adapters;

/**
 * @author zac
 * @description:
 * @data 2020 2020/2/29 22:16
 */
public class Adapter extends Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    @Override
    public void request() {
        adaptee.specialRequest();
    }
}
