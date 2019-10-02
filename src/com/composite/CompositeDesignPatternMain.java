package com.composite;

public class CompositeDesignPatternMain {

    public static void main(String[] args) {
        Employee emp1=new Developer("Araby", 10000);
        Employee emp2=new Developer("Ammar", 10000);
        Employee emp3=new Developer("Hossam", 10000);
        Employee manager1=new Manager("Alaa",10000);
        manager1.add(emp1);
        manager1.add(emp2);
        manager1.add(emp3);
        Employee emp4=new Developer("Abbas", 20000);
        Manager generalManager=new Manager("Ahmed", 50000);
        generalManager.add(emp4);
        generalManager.add(manager1);
        generalManager.print();
    }

}
