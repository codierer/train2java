package com.dp.afp;

/**
 * @author zac
 * @description:
 * @data 2020 2020/2/19 22:55
 */
public class FactoryB implements IFactory {
    @Override
    public IProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public IProductB createProductB() {
        return new ProductB2();
    }
}
