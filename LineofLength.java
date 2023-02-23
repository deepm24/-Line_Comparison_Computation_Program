package org.example;

import java.util.Scanner;

public  class LineofLength {
    public void lineUse()
    {
        double one = 0;
        double two = 0;
        for (int i=1;i<=2;i++)
        {
            if (i==1)
            {
                System.out.println("enter value for  line one ");
                one = line();
                System.out.println("length of line one "+one);
            }

            else
            {
                System.out.println("enter value for  line two");
                two= line();
                System.out.println("length of line two " + two);

            }
        }
        if (one==two)
        {
            System.out.println("lines are equal");
        }
        else if(one>two)
        {
            System.out.println("line one is greater than line two");
        }
        else
        {
            System.out.println("line two is greater than line one");
        }
    }
    public  static double line()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x1 value:");
        double x1 = sc.nextDouble();

        System.out.println("enter y1");
        double y1 = sc.nextDouble();

        System.out.println("enter x2");
        double x2 = sc.nextDouble();

        System.out.println("enter y2");
        double y2 = sc.nextDouble();

        double length = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        System.out.println("Length of Line :" + length);
        return length;
    }
}
