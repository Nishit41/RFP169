package com.bridgelabz;
import java.util.Scanner;
public class TemperatureConversion {

        public static void main(String arg[])
        {
            double a,b;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter  Fahrenheit temperature");
            a=sc.nextDouble();
            System.out.println("Celsius temperature is = "+celsius(a));
            System.out.println("enter celcius temperature");
            b=sc.nextDouble();
            System.out.println("farenheit Temperature is ="+farenheit(b));
        }
        static double celsius(double f)
        {
            return  (f-32)*5/9;
        }
        static  double farenheit(double c)
        {
            return (c * 9/5) + 32 ;
        }
    }

