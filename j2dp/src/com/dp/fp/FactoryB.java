package com.dp.fp;

/**
 * @author zac
 * @description: the factory of B
 * @data 2020 2020/2/19 21:47
 */
public class FactoryB implements IFactory {

    IProduct productB;
    public FactoryB(){
        this.productB = new ProductB();
    }
    @Override
    public IProduct getProduct() {
        return this.productB;
    }
}
