package org.example;

import OperatorsAndExpressions.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      relational r = new relational();
      r.grade();

        System.out.println("Enter apple:");
      int mango = sc.nextInt();
        System.out.println("Enter banana:");
        int banana = sc.nextInt();
        System.out.println("Suger:");
        int suger = sc.nextInt();

      System.out.println("Enter salary:");
      int salary = sc.nextInt();
      System.out.println("Expence:");
      int expence = sc.nextInt();

      System.out.println("Enter no.  you want to know the square: ");
      int no = sc.nextInt();
      sc.nextLine();


      System.out.println("enter name: ");
      String name = sc.nextLine();
      System.out.println("enter hobby:");
      String hobby = sc.nextLine();

        arithmatic ar = new arithmatic();
        ar.add(mango, banana, suger);

        logicalExpressions le = new logicalExpressions();
        le.picnic();

        totalSavedAmt save = new totalSavedAmt();
        save.totalsaving(salary, expence);

        square sr = new square();
        sr.squarenum(no);
        personalisedMsg msg = new personalisedMsg();
        msg.msg2(name,hobby);
        swap swap2= new swap();
        swap2.swapval();
        swap2.swapval2();
        sc.close();
    }
}