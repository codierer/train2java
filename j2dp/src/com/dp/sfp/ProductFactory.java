package com.dp.sfp;

/**
 * @author zac
 * @description:
 * @data 2020 2020/2/19 16:30
 */
public class ProductFactory {

    public IProduct getProduct(String productType){
        if ("ProductA".equalsIgnoreCase(productType)){
            return new ProductA();
        }else if ("ProductB".equalsIgnoreCase(productType)){
            return new ProductB();
        }
        return null;
    }

}
