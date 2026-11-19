package com.pluralsight.finance;

import java.math.BigDecimal;

public class House {
    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    public House(int yearBuilt, int squareFeet, int bedrooms) {
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    public BigDecimal getValue() {
        return BigDecimal.valueOf(squareFeet * 180);
    }
}