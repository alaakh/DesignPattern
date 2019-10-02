package com.strategy;

public class EmployeeDiscount implements DiscountStratgy {

    @Override
    public double getDiscountRate() {
        return .9;
    }
}
