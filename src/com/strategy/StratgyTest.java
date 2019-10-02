package com.strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StratgyTest {

    public static  void main(String [] args){

        Item item1=new Item("IPhone",100);
        Item item2=new Item("Note",100);

       Cart cart= createCart(false,true,item1,item2);
       System.out.println(cart.getTatol());
    }

    static  Cart createCart(boolean isMember,boolean isEmployee,Item ... items){

        Cart cart=new Cart();
        List<Item> itemList = new ArrayList<>(Arrays.asList(items));

        cart.setItems(itemList);
        if(isEmployee){
            cart.setDiscountStratgy(new EmployeeDiscount());
        }
        else if(isMember){
            cart.setDiscountStratgy(new MemberDiscount());
        }

        return cart;
    }


}
