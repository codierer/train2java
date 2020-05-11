package com.flex;

import com.j8new.Car;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author zac
 * @description:
 * @data 2020 2020/3/7 20:12
 */
public class FlexDemo {

    public static void main(String[] args){
        Car car = new Car();
        Class ca = car.getClass();
        System.out.println(ca.getName());
        Constructor[] ar = ca.getDeclaredConstructors();
        System.out.println(ar.length);
        System.out.println(ar);
        Class[] p = {String.class};
        try {
            Constructor arr = ca.getDeclaredConstructor(p);
            arr.newInstance("tt");

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
