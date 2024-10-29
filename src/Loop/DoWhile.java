package Loop;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        int i = 1, num =17;
        do
             {
                System.out.println(num + "*" + i + "=" + (num * i));
                i = i + 1;
            }
        while (i <= 12 );
        }
}
