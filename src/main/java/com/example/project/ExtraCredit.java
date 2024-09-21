package com.example.project;
import java.util.Scanner;


public class ExtraCredit {


    public static String calculateTip(int people, int percent, double cost, String items) {
        StringBuilder result = new StringBuilder();

        double tip = percent * 0.01 * cost;
        double totalBill = tip + cost;
        double perBeforeCost = cost / people;
        double tipPerPerson = tip / people;
        double perAfterCost = totalBill / people;

        /* learned to round with "double roundOff = (double) Math.round(a * 100) / 100"
        got it from here: https://stackoverflow.com/questions/11701399/round-up-to-2-decimal-places-in-java*/
        double roundedTip = (double)Math.round(tip * 100.0) / 100.0;
        double roundedBill = (double)Math.round(totalBill * 100.0) / 100.0;
        double roundedperBeforeCost = (double)Math.round(perBeforeCost * 100.0) / 100.0;
        double roundedtipPerPerson = (double)Math.round (tipPerPerson * 100.0) / 100.0;
        double roundedperAfterCost = (double)Math.round(perAfterCost * 100.0) / 100.0;

        result.append("-------------------------------\n");
        result.append("Total bill before tip: " + "$" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%" + "\n");
        result.append("Total tip: " + "$" + roundedTip + "\n");
        result.append("Total Bill with tip: " + "$" + roundedBill + "\n");
        result.append("Per person cost before tip: " + "$" + roundedperBeforeCost + "\n");
        result.append("Tip per person: " + "$" + roundedtipPerPerson + "\n");
        result.append("Total cost per person: " + "$" + roundedperAfterCost + "\n");
        result.append("-------------------------------\n");

        //the two lines  should go below result.append("-------------------------------\n"); 
        result.append("Items ordered:\n");
        result.append(items);

        return result.toString();
    }
                                   
    public static void main(String[] args) {
        int people = 6;
        int percent = 25;
        double cost = 52.27;
        String items = "salmon\npizza\nsalad\nfrench fries\nmilkshake\n";; 

        //Your scanner object and while loop should go here
        // boolean string comparison on stack overflow: https://stackoverflow.com/questions/513832/how-do-i-compare-strings-in-java
        Scanner scan = new Scanner(System.in);
        String input = "";
        //
        while ("-1".equals(input)) {
            System.out.println("Enter an item name or type '-1' to finish: ");
            input = scan.nextLine();
            if ("-1".equals(input)) {
                items = items + input + "\n";
            }
        }
    
        // code below the while loop runs after the loop ends
        System.out.print("You entered ‘x’ :( ");
        System.out.println(calculateTip(people,percent,cost,items));
        scan.close();
    }
}
