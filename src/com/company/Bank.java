package com.company;

public class Bank extends Person implements Printable{
    private String bank;


    public Bank(String name, String bank) {

        this.bank = bank;
    }


    @Override
    public void print() {
        System.out.println("NAME:"+getName()+"\nBank:"+bank);
    }
}
