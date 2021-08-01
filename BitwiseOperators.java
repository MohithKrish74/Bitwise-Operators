package com.keyword;

import java.util.Scanner;

public class BitwiseOperators
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = in.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = in.nextInt();
        System.out.println("The Bitwise And on the numbers is "+(number1&number2));
        System.out.println("The Bitwise inclusive OR on the numbers is "+(number1|number2));
        System.out.println("The Bitwise exclusive OR on the numbers is "+(number1^number2));
    }
}
