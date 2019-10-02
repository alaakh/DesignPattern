package com.builder.mutable;

public class User {


    //All attributes
     String firstName; // required
     String lastName; // required
     int age; // optional
     String phone; // optional
     String address; // optional

    static UserBuilder getBuilder(){
        return new UserBuilderImp();

     }

    @Override
    public String toString() {
        return "User: "+this.firstName+", "+this.lastName+", "+this.age+", "+this.phone+", "+this.address;
    }

}
