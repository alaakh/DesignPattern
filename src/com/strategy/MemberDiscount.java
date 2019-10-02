package com.strategy;

public class MemberDiscount implements DiscountStratgy {

    @Override
    public double getDiscountRate() {
        return .95;
    }
}
