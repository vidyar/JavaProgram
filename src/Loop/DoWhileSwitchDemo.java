package Loop;

import java.util.Scanner;

public class DoWhileSwitchDemo {
    public static void main(String[] args) {


    int a ;
    int b ;
    int c;
    String choice;

    String operation = "";
do

    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a= ");
        a = sc.nextInt();



        System.out.println("Enter b = ");
        b = sc.nextInt();



        System.out.println("Enter Operation = ");
        operation = sc.next();


        switch (operation) {
            case "add":
                c = a + b;
                System.out.println("basic.Addition=" + c);
                break;
            case "sub":
                c = a - b;
                System.out.println("Subtraction=" + c);
                break;
            case "mult":
                c = a * b;
                System.out.println("Multiplication=" + c);
                break;
            case "div":
                c = a / b;
                System.out.println("Division=" + c);
                break;

            default:
                System.out.println("wrong choice");
                //  break;
        }
        System.out.println("do you want to continue (Y/N)");
        choice= sc.next();
    }
while(choice.equalsIgnoreCase("n")!= true);

}
}


