package com.bridgelabz;
import java.util.Scanner;
public class flipcoin {
    public static void main(String[] args) {
        System.out.println("enter the number of times to flip the coin");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
        for (int i = 1; i <= num; i++) {
            int head = 1;
            double check = Math.floor(Math.random() * 10) % 2;
            System.out.println(check);
            if (check == head)
                System.out.println("head");
            else
                System.out.println("tail");

        }
    }
}
