package com.bridgelabz;

public class roots {

    public static void main(String[] args)
    {

        // value a, b, and c
        double a = 50, b = 55, c = 10;
        double root1, root2;

        // calculate the determinant (b2 - 4ac)
        double determinant = b * b - 4 * a * c;


            // two real and distinct roots
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);

        System.out.println("roots are"+root1+" "+root2);
        }


    }

