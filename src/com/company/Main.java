package com.company;

public class Main {


    public static void main(String[] args) {
        createObject("Bank");


    }



public static Person createObject(String className) {
    while (true) {
        switch (className) {
            case "Bank":
                Bank bank = new Bank("Tom", "KICB");
                bank.setName("Tom");
                bank.print();

            case "Money":
                Money money = new Money("TOM", 12000);
                money.print();
            case "Nation":
                Nation nation = new Nation("TOM", "american");
                nation.print();
                break;



        }return null;
    }
}
}