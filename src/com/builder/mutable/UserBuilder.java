package com.builder.mutable;

public interface UserBuilder {
    User  build() throws  Exception;

    UserBuilder firstName(String firstName);
    UserBuilder lastName(String lasttName);
    UserBuilder age(int ag);
    UserBuilder phone(String phone);
    UserBuilder address(String address);
}
