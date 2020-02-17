package com.example.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Run2Callable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int i = 0;
        for (;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
        return i;
    }

    public static void main(String[] args){
        Run2Callable rc = new Run2Callable();
        FutureTask<Integer> ft = new FutureTask<>(rc);

        for (int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            if(i==20){
                new Thread(ft).start();
            }
        }
        try{
            System.out.println(ft.get()+" a");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
