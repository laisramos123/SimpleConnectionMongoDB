package com.example.conectdatabase;

import org.springframework.data.annotation.Id;

public class Customer {
    @Id
    public String id;
    public String firstName;
    public String lastName;

    public Customer(){}
    public Customer(String firstName, String lastName ){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Override
    public String toString(){
        return String.format(
                "Custumer [id=%s, firstName= '%s', lasrName= '%s']",
                id,firstName,lastName);
    }
}
