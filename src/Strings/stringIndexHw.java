package Strings;
public class stringIndexHw {
    public static void main(String[] args) {

        String str1 = "this is a java"; // find character at index 3 & length
        String str2 = "hi i am here";// find character at index 2  & length
        String str3 = "where are you";// find character at  index 0 &  length
        String str4 = "this is a demo";// find character at index 5 & length
        String str5 = "core java";// find character at 6 index & length

        System.out.println("character at index 3 = " + str1.charAt(3) + "\t and length = " + str1.length());

        System.out.println("character at index 2 = " + str2.charAt(2) + "\t and length = " + str2.length());

        System.out.println("character at index 0 = " + str3.charAt(0) + "\t and length = " + str3.length());

        System.out.println("character at index 5 = " + str4.charAt(5) + "\t and length = " + str4.length());
            
        System.out.println("character at index 6 = " + str5.charAt(6) + "\t and length = " + str5.length());
        
    }
}

