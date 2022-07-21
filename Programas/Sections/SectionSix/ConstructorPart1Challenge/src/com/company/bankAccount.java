package com.company;

public class bankAccount {
    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public bankAccount(){
        this(000256, 0, "Default name", "Default email", 999999999);
    }
    public bankAccount(int accountNumber, int balance, String customerName, String email, int phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    //setters
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    //getters
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public int getBalance(){
        return this.balance;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public String getEmail(){
        return this.email;
    }
    public int getPhoneNumber(){
        return this.phoneNumber;
    }
    public void addFunds(int funds){
        this.balance += funds;
    }
    public void withdrawFunds(int funds){
        if(balance > funds){
            this.balance -= funds;
        }
    }
}