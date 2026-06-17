package org.example;

import OOPS.BankingSystem;
import OOPS.Calculator;
import OperatorsAndExpressions.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        BankingSystem bk = new BankingSystem(1,"Shrikrushna");
        System.out.println("Enter Your choice:" +
                "1. Deposit "+
                "2.Withdraw "+
                "3.Get balance and Info");
        int choice =sc.nextInt();
        switch (choice) {
            case 1:
                bk.deposit(sc.nextInt());
                break;
            case 2:
                bk.withdraw(sc.nextDouble());
                break;
            case 3:
                bk.getInfo();
                break;
            default:
                System.out.println("Invalid choice");
        }

        Calculator c = new Calculator();
        System.out.println("Addition of 2 nos:"+c.add(1,2));
        System.out.println("Addition of 3 nos:"+c.add(1,2,3));
        System.out.println("Multiplication of 2 nos:"+c.multiply(2,4));
        System.out.println("Multiplication of 3 nos:"+c.multiply(3,4,5));

        sc.close();
    }
}