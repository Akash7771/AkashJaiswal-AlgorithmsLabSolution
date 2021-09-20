package com.greatlearning.paymoney;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PayMoneyTransaction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer [] transactions ;
        Integer totalNoOfTarget;
        Integer targetAmount ;
        Integer currentTarget =0 ;

        try {
            System.out.println("Enter the size of transaction array");
            Integer n = sc.nextInt();
            transactions = new Integer[n];
            System.out.println("Enter the values of array");
            for (int i = 0; i < n; i++) {
                Integer transaction = sc.nextInt();
                transactions[i] = transaction;
            }
            System.out.println("Enter the total no of targets that needs to be achieved");
            totalNoOfTarget = sc.nextInt();

            while (currentTarget < totalNoOfTarget) {
                Integer sum = 0;
                Boolean targetAchieved = Boolean.FALSE;

                System.out.println("Enter the value of target");
                targetAmount = sc.nextInt();
                if (targetAmount > 0) {
                    for (int i = 0; i < n; i++) {
                        sum += transactions[i];
                        if (sum.compareTo(targetAmount) >= 0 && !targetAchieved) {
                            targetAchieved = Boolean.TRUE;
                            System.out.println("Target achieved after " + (i + 1) + " transactions ");
                        }
                    }
                    if (!targetAchieved)
                        System.out.println("The target is not achieved");

                    currentTarget++;

                } else {
                    System.out.println("target value cannot be zero or less");
                }

            }
        }catch (InputMismatchException ime){
            System.err.println("Invalid input expected Integer");
        }
        catch (Exception e){
            System.err.println(e);
        }
    }
}


