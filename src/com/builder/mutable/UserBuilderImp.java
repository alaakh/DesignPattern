package com.builder.mutable;

public class UserBuilderImp implements UserBuilder {

    User user;

    public  UserBuilderImp(){
        user =new User();
    }


    @Override
    public User build() throws Exception {
        if(user.firstName ==null || user.firstName.isEmpty())
            throw new Exception();

        return user;
    }

    @Override
    public UserBuilder firstName(String firstName) {
        user.firstName=firstName;
        return this;
    }

    @Override
    public UserBuilder lastName(String lastName) {
        user.lastName=lastName;
        return this;
    }

    @Override
    public UserBuilder age(int age) {
        user.age=age;
        return this;
    }

    @Override
    public UserBuilder phone(String phone) {
        user.phone=phone;
        return this;
    }

    @Override
    public UserBuilder address(String addres) {
        user.address=addres;
        return this;
    }

}
