package com.test;

import com.protecteds.ProtestedObject;

/**
 * @author zac
 * @description:
 * @data 2020 2020/2/27 17:50
 */
public class TestPretecteds extends ProtestedObject{

    public static void main(String[] args){
        //new ProtestedObject();// ProtestedObject is the protected function
    }

    @Override
    protected void run() {
        super.run();
    }
}
