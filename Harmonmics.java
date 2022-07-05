package com.bridgelabz;
import java.util.Scanner;
public class Harmonmics {
    public static void main(String[] args) {
        System.out.println("enter N");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        for( int i=1;i<=N;i++)
        {
            int x=sum/i +1;

            System.out.println(x);
        }
    }
}
