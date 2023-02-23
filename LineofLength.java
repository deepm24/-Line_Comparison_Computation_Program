package org.example;

import java.util.Scanner;

public class LineofLength
{
    public void line()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x1 value:");
        double x1=sc.nextDouble();

        System.out.println("enter y1");
        double y1=sc.nextDouble();

        System.out.println("enter x2");
        double x2=sc.nextDouble();

        System.out.println("enter y2");
        double y2=sc.nextDouble();

        double length= Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        System.out.println("Length of Line :" +length);
    }
}
