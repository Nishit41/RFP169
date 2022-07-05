package com.bridgelabz;
import java.util.Scanner;
public class largestamongthree {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        double first = sc.nextDouble();
        System.out.println("enter second number");
        double second = sc.nextDouble();
        System.out.println("enter third number");
        double third = sc.nextDouble();;
        if ((first > second) && (first > third)) {
            System.out.println("first is greatest among all");
        } else if ((second > first) && (second > third)) {
            System.out.println("second is greatest among all three");
        } else
            System.out.println("Third is greatest among all");
    }
}
