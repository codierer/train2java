package com.dp.singleton;

/**
 * @author zac
 * @description:
 * @data 2020 2020/2/20 16:46
 */
public enum Singleton {

    INSTANCE;

    private Resource instance;

    Singleton(){
        instance = new Resource();
    }

    public Resource getInstance(){
        return instance;
    }
}

class Resource{

}
