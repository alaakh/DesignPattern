package com.strategy;

import java.util.List;

public class Cart {

   private  List<Item> items;
   private DiscountStratgy discountStratgy;

    public void setDiscountStratgy(DiscountStratgy discountStratgy) {
        this.discountStratgy = discountStratgy;
    }

    public DiscountStratgy getDiscountStratgy() {
        return discountStratgy;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    public double getTatol(){
        double total=0;
        for (Item item :items){
            total +=item.getPrice();
        }
        total *=discountStratgy.getDiscountRate();
        return  total;
    }

}
