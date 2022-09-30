package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private int age;



    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getAge(){
        return this.age;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age){
        if (age >= 0 && age <= 100) {
            this.age = age;
        }
        else {
            this.age = 0;
        }
    }

    public boolean isTeen(){
        if (getAge() > 12 && getAge() < 20){
            return true;
        }
        else{
            return false;
        }
    }

    public String getFullName(){
        if(getFirstName().isEmpty() == false && getLastName().isEmpty() == true){
            return getFirstName();
        }
        else if (getLastName().isEmpty() == false && getFirstName().isEmpty() == true){
            return getLastName();
        }
        else if (getLastName().isEmpty() == false && getFirstName().isEmpty() == false){
            return getFirstName() + " " + getLastName();
        }
        else{
            return "";
        }
    }
}
