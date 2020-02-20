package com.dp.sfp;

/**
 * @author zac
 * @description:
 * @data 2020 2020/2/19 17:09
 */
public class SFPDemo {

    public static void main(String[] args){
        ProductFactory productFactory = new ProductFactory();
        IProduct productA = productFactory.getProduct("ProductA");
        productA.get();
        IProduct productB = productFactory.getProduct("ProductB");
        productB.get();
    }
}
