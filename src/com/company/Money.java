package com.company;

public class Money extends Person implements Printable {
    private int sum;

    public Money(String name, int sum) {
        this.sum = sum;
    }


    @Override
    public void print() {
        System.out.println("его счет:"+sum);
    }

}
