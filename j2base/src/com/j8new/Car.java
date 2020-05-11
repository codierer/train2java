package com.j8new;

/**
 * @author zac
 * @description:
 * @data 2020 2020/2/29 23:16
 */
public class Car implements Vel,Fwheel {
    @Override
    public void print() {
        System.out.println("this is car");
    }

    public Car(){}

    public Car(String name){
        System.out.println(name + "Car");
    }
    private void run(){
        System.out.println("private run function");
    }

    public static void main(String[] args){
        Car car = new Car();
        car.print();
    }
}
