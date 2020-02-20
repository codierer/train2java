package com.dp.fp;

/**
 * @author zac
 * @description:  To test the factory pattern 
 * @data 2020 2020/2/19 22:13
 */
public class FPDemo {

    public static void main(String[] args){
        FactoryA productFactoryA = new FactoryA();
        FactoryB productFactoryB = new FactoryB();

        IProduct productA = productFactoryA.getProduct();
        productA.get();
        IProduct productB = productFactoryB.getProduct();
        productB.get();
        ProductA productA1 = new ProductA();
        //ProductA productA1 = productFactoryA.getProduct();
        productA1.get();
    }
}
