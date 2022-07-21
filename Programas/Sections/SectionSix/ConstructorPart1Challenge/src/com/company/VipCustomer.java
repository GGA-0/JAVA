package com.company;

public class VipCustomer {
    private String name;
    private int creditLimit;
    private String email;

    public VipCustomer(){
        this("Default name",1000,"default email");
        System.out.println("1");
    }

    public VipCustomer(int creditLimit, String email) {
        this("Default name", creditLimit, email);
        System.out.println("2");
    }

    public VipCustomer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        System.out.println("3");
    }

    public String getName() {
        return name;
    }

    public int getcreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
