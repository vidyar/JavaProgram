package Strings;

public class substringCW {
    public static void main(String[] args) {

        String str = "This is Java program";
        System.out.println(str);
        System.out.println("Upper case is " + str.toUpperCase());
        System.out.println("Lower case is " + str.toLowerCase());
        System.out.println(str.substring(5));
        System.out.println(str.substring(6, 12));
        System.out.println(str.substring(8, 14));
    }
}