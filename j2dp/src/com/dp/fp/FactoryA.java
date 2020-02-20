package com.dp.fp;

/**
 * @author zac
 * @description: the factory of A
 * @data 2020 2020/2/19 21:38
 */
public class FactoryA implements IFactory{

    IProduct productA;

    public FactoryA(){
        this.productA = new ProductA();
    }


    @Override
    public IProduct getProduct() {
        return this.productA;
    }
}
