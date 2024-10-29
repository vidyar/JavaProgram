package basics;

import java.util.Scanner;

public class AreaofRectangle {
    public static void main(String[] args) {
        int l, b, Area;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter l = ");
        l = sc.nextInt();

        // for decimal value - use sc.nextDouble()

        System.out.println("Enter b = ");
        b = sc.nextInt();

        Area = l* b;

        System.out.println("Area of Rectangle ="+Area);
    }
}
