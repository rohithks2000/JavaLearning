package com.rohithks2000;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        byte age = 30;
        long viewsCount = 3_232_234_223L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;
        Date now = new Date();
        String msg = "test" + "helloworld";
        System.out.println(msg.endsWith("d"));
        System.out.println(msg.length());
        System.out.println(msg.indexOf("h"));
        System.out.println(msg.toLowerCase());
        System.out.println(msg.trim());
        System.out.println(msg.replace("firstvalue", "second value"));
        System.out.println("age is " + age);
        System.out.println("age is \"hello\" " );
        System.out.println("C:\\ " );


        //arrays
        int[] numbers = new int[5];
        numbers[0] = 1;
        System.out.println(Arrays.toString(numbers));

        int[][] num = new int[2][3];
        System.out.println(Arrays.deepToString(num));

        //constants
        final float PI = 3.14F;

        //Arithematic operations
        int result = 10/3;
        double  res = (double)10/3;
        System.out.println( res);

        //Casting & parsing
            //implicit casting

            //Explicit casting

        //Math class

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String res1 = currency.format(2123.233);
        System.out.println(res1);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String res2 = percent.format(0.01);
        System.out.println(res2);

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter name");
        String name = scanner.nextLine().trim();
        System.out.println("Name is " + name);

    }
}
