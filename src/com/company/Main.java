package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// Exercise  №1
        int[] months = new int[30];
        double total = 0;
        for (int i = 0; i < months.length; i++ ){
            months[i] = (int) Math.round((Math.random()*100_000)+ 100_000);
            total = total + months[i];
        }
        System.out.println("Total: " + total + " rubles.");
    // Exercise №2
        int minimumExpense = months[0];
        for (int i = 1; i<months.length; i++){
            if (months[i]<minimumExpense){
                minimumExpense = months[i];
            }
        }
        Arrays.sort(months);
        System.out.println("Minimum expense in one day " + minimumExpense + " rubles");
        int maximumExpense = -1;
        for (int i = 0; i< months.length; i++){
            if (months[i]>maximumExpense){
                maximumExpense = months[i];
            }
        }
        System.out.println("Maximum expense in one day " + maximumExpense + " rubles");
    // Exercise №3
        double average = total /months.length;
        System.out.println("The average amount of spending rubles is " + average);
    // Exercise №4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.println();
        for (int i = reverseFullName.length-1; i>=0; i--){
            System.out.print(reverseFullName[i]);
        }
        //Sorry




    }
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
