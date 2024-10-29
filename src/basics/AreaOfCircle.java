package basics;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        int r;
        double pi=3.14;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter r = ");
        r = sc.nextInt();
        double Area = pi*r*r;

        System.out.println("Area of Circle = " + Area);


    }
}
