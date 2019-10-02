package what.s.the.area;

import java.util.Scanner;

public class WhatSTheArea {
    
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int surfaceArea = 0;
        surfaceArea += triangle();
        surfaceArea += triangle();
        surfaceArea += parallelogram();
        surfaceArea += donutSquare();
        surfaceArea += circle();
        surfaceArea += circle();
        surfaceArea += circle();
        System.out.println("\nThe total area of Michael’s truck is : " + surfaceArea);
    }
    
    public static int triangle() {
        System.out.println("\nThe area of a triangle is: 1/2 * base * height");
        System.out.print("base > ");
        int base = in.nextInt();
        System.out.print("height > ");
        int height = in.nextInt();
        int area = (int)(0.5 * base * height);
        System.out.println("The area of this shape is: " + area);
        return area;
    }
    
    public static int parallelogram() {
        System.out.println("\nThe area of a parallelogram is: base * height");
        System.out.print("base > ");
        int base = in.nextInt();
        System.out.print("height > ");
        int height = in.nextInt();
        int area = (int)(base * height);
        System.out.println("The area of this shape is: " + area);
        return area;
    }
    
    public static int donutSquare() {
        System.out.println("\nThe area of a donut square is: outerSide^2 - innerSide^2");
        System.out.print("Outer Side > ");
        int outerSide = in.nextInt();
        System.out.print("Inner Side > ");
        int innerSide = in.nextInt();
        int area = (int)(Math.pow(outerSide, 2) - Math.pow(innerSide, 2));
        System.out.println("The area of this shape is: " + area);
        return area;
    }
    
    public static int circle() {
        System.out.println("\nThe area of a circle is: pi * radius^2");
        System.out.print("Radius > ");
        int radius = in.nextInt();
        int area = (int)(Math.PI * Math.pow(radius, 2));
        System.out.println("The area of this shape is: " + area);
        return area;
    }
    
}