package com.dehghan.factory;

public class Calculation2 extends  Calculation{
    public Calculation2(int amountPerMonth, int taxPercent, String product) {
        super(amountPerMonth, taxPercent, product);
    }

    @Override
    public int calculate() {
        return amountPerMonth * taxPercent;
    }
}
