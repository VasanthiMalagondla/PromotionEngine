package com.demo.engine;

import java.math.BigDecimal;

public class Product {
    public String SKUID ;
    public BigDecimal price;
    public Product(String SKUID)
    {
        this.SKUID = SKUID;
        switch (SKUID)
        {
            case "A":
                this.price = new BigDecimal(50);
                break;
            case "B":
                this.price = new BigDecimal(30);
                break;
            case "C":
                this.price = new BigDecimal(20);
                break;
            case "D":
                this.price = new BigDecimal(15);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + SKUID);
        }
    }

    public String getSKUID() {
        return SKUID;
    }

    public void setSKUID(String SKUID) {
        this.SKUID = SKUID;
    }



    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

}
