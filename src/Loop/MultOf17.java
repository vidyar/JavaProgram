package Loop;

import java.util.Scanner;

public class MultOf17 {

    public static void main(String[] args) {
        int i = 1, num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num= ");
        num = sc.nextInt();
        if(num==17) {
            System.out.println("the entered number is " + num);
            while (i <= 10 ) {
                System.out.println(num + "*" + i + "=" + (num * i));
                i = i + 1;
            }
        }
        else
            System.out.println("the entered number is not 17");

    }
}

