package com.dehghan.factory;

public class CalcutionFactory {

    public Calculation createCalculation(int amountPerMonth, int taxPercent,
                                         String product, boolean festival){

        if(festival){
            return new Calculation1(amountPerMonth, taxPercent, product);

        }else {
            return new Calculation2(amountPerMonth,taxPercent, product);
        }
    }
}
