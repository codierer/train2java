package com.example.runnable;

public class Run2Runable implements Runnable {
    @Override
    public void run() {
        //while (true) {
            System.out.println("runnable");
            System.out.println(this);
        //}

    }

    public static void main(String[] args){
        Run2Runable r1 = new Run2Runable();
        Run2Runable r2 = new Run2Runable();

        new Thread(r1).start();
        new Thread(r1).start();
        new Thread(r2).start();
    }
}
