package com.pulkit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Factors();
    }



    public static void Factors(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer for factors: ");
        int number = scanner.nextInt();
        var factors = 0;
        for(int i = 1; i<=number; i++){
            if(number%i==0)
            {factors++;
                System.out.println(i);


        }
    }
        if(factors == 2){
            System.out.println("This is a prime number.");
        }
        System.out.println("\n"+number+" has "+factors+" factors.");
        scanner.close();




}






}
