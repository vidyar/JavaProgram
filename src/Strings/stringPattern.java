package Strings;

public class stringPattern {

    public static void main(String[] args) {

        String str = "Vidya";

      /*  System.out.println(str.substring(0)+str.substring(0,0));
        System.out.println(str.substring(1)+str.substring(0,1));
        System.out.println(str.substring(2)+str.substring(0,2));
        System.out.println(str.substring(3)+str.substring(0,3));
        System.out.println(str.substring(4)+str.substring(0,4));
        System.out.println(str.substring(5)+str.substring(0,5));
        System.out.println(str.substring(6)+str.substring(0,6));*/

        for(int i=0;i<str.length();i++)
        {
            System.out.println(str.substring(i)+str.substring(0,i));
        }

    }

}
