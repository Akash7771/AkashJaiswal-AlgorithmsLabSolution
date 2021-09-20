package com.greatlearning.currencyProblem.service;

import com.greatlearning.currencyProblem.driver.CurrencyDenomRunner;
import com.greatlearning.currencyProblem.driver.MergerSortService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CountTheNotes {

    public static void main(String[] args) {
        MergerSortService mergeSortService = new MergerSortService();
        Scanner sc = new Scanner(System.in);
        CurrencyDenomRunner currencyDenomRunner = new CurrencyDenomRunner();

        Integer [] currencyDenominations ;
        Integer [] currenctCount ;

        Integer totalCurrency;
        Integer amount;
        try {
            System.out.println("Enter the size of currency denominations");
            totalCurrency = sc.nextInt();
            currencyDenominations = new Integer[totalCurrency];

            System.out.println("Enter the currency denominations value");
            for (int i = 0; i < totalCurrency; i++) {
                currencyDenominations[i] = sc.nextInt();
            }

            System.out.println("Enter the amount you want to pay");
            amount = sc.nextInt();
            mergeSortService.mergeSort(currencyDenominations , 0 , totalCurrency -1);

            currenctCount = currencyDenomRunner.currenctDenominationCounter( currencyDenominations , amount);

            for(int i=0 ; i < totalCurrency ; i++)
                if(currenctCount[i]!=null)
                    System.out.print(currencyDenominations[i]+":"+currenctCount[i] + "\n");

        }catch (InputMismatchException ime){
            System.err.println("Invalid input expected Integer");
        }
        catch (Exception e){
            System.err.println(e);
        }
    }
}
