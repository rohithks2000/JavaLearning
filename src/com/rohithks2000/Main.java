package com.rohithks2000;

import java.math.BigInteger;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        final int MONTHS_IN_YEAR = 12;
        final int PERCENT = 100;

        System.out.println("Mortgage Calculator");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal : ");
        NumberFormat price = NumberFormat.getCurrencyInstance(Locale.US);//price.format(principal)
        int principal = scanner.nextInt();

        System.out.print("Annual Interest monthlyRate : ");
        NumberFormat percent = NumberFormat.getPercentInstance();//monthlyRate.format(principal)
        float monthlyRate = scanner.nextFloat() / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period(In years) : ");
        int months = scanner.nextInt() * MONTHS_IN_YEAR;

        double mortgage = (float)principal * monthlyRate * ((float)Math.pow ((1+monthlyRate), months)) / ((float)Math.pow ((1+monthlyRate), months) -1);
        System.out.print("Mortgage : " + price.format(mortgage));



    }
}
