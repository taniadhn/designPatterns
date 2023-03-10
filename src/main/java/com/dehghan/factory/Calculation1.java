package com.dehghan.factory;

public class Calculation1 extends  Calculation{
    public Calculation1(int amountPerMonth, int taxPercent, String product) {
        super(amountPerMonth, taxPercent, product);
    }

    @Override
    public int calculate() {
        return amountPerMonth * taxPercent +200;
    }
}
