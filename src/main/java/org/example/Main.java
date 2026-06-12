package org.example;

import OperatorsAndExpressions.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int[] arr = new int[5];
      arr[0] = 2;
      arr[1] = 6;
      arr [2]= 5;
      arr[3]=9;
      arr[4] = 12;
      for (int i=0;i< arr.length;i++){
          System.out.print(arr[i] +" ");

      }
      System.out.println("sum of all array elements:");
        int sum =0;
        for(int j =0;j< arr.length;j++){

        sum += arr[j];
    }
        System.out.println("Sum of array element is:"+sum);
        double avg;
        avg = sum/ arr.length;
        System.out.println("Average is: " +avg);

    }}