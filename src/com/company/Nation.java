package com.company;

public class Nation extends Person implements Printable{
    private String nation;

    public Nation(String name, String nation) {

        this.nation = nation;
    }


    @Override
    public void print() {
        System.out.println("его нация:"+nation);
    }
}
