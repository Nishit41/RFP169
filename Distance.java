package com.bridgelabz;
import java.util.Scanner;
public class Distance
    {
        public static void main(String arg[])

        {

            int x1=0,x2,y1=0,y2;

            double dis;

            Scanner sc=new Scanner(System.in);

            System.out.println("enter x2point");

            x2=sc.nextInt();

            System.out.println("enter y2 point");

            y2=sc.nextInt();

            dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

            System.out.println("distancebetween"+dis);

        }

    }

