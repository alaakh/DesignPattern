package com.builder.mutable;

public class Test {

    public static void main(String[] args) {
        UserBuilder userBuilder=User.getBuilder();
        try {
            User user= userBuilder.firstName("ALaa").lastName("Khalil").age(32).build();
            System.out.println(user);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
