package com.dp.afp;

/**
 * @author zac
 * @description:
 * @data 2020 2020/2/19 22:44
 */
public class FactoryA implements IFactory{

    @Override
    public IProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public IProductB createProductB() {
        return new ProductB1();
    }
}
