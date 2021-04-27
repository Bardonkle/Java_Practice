

import java.util.*;
import java.text.DecimalFormat;

public class currency_converter {
    public static void main(String[] args) {

        // double allows decimal values
        double amount, dollar, pound, euro, yen, rupee;

        // allows us to format decimal values
        DecimalFormat f = new DecimalFormat("##.##");

        /* Scanner is used to read input data from different sources like input, users, files etc.
        nextFloat() and nextInt() are examples of what is being read from the user */
        Scanner sc = new Scanner(System.in);

        // print out the input of what the user wants to convert
        System.out.println("Welcome to the Currency Converter!");

        System.out.println("which currency do you want to convert? ");

        System.out.println("rupee \t2:dollar \t3:pound \n4:euro \t5:yen ");
        code = sc.nextInt();

        System.out.println("How mmuch money you want to convert? ");
        amount = sc.nextFloat();
    }

}

