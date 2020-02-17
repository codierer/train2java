package com.example.thread;

public class Run2Thread extends Thread {

    public Run2Thread(String name){
        super(name);
    }

    @Override
    public void run() {
        while (true){
            System.out.println("good time");
            System.out.println(this);
        }
    }

    public static void main(String[] args){
        Run2Thread run2Thread = new Run2Thread("111");
        run2Thread.start();
    }
}
