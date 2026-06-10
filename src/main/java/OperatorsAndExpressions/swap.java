package OperatorsAndExpressions;

import org.w3c.dom.ls.LSOutput;

public class swap {
    int no1 = 3;
    int no2 = 4;
    public void swapval(){
        System.out.println("Before swap values:" + no1 + " " + no2);
        int temp = no1;
        int no1 = no2;
        int no2 = temp;
        System.out.println("After Swap: " + no1 + " " +no2);

    }
    public void swapval2(){
        no1 = no1 + no2;
        no2 = no1 - no2;
        no1 = no1 - no2;
        System.out.println(no1+" "+no2);
    }
}
