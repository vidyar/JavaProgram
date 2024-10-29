package Strings;

public class StringSplit2HW {
    public static void main(String[] args) {
        String str = "its not to late to bring it as you told me " ;
       // Print the words whose second character is ‘o’
        String[] stArr = str.split(" ");

        // print only the words that ends with y

        for (int i=0 ; i< stArr.length ; i++) {
            int l  =  stArr[i].length();
            if(stArr[i].charAt(1)=='o')
                System.out.println(stArr[i]);

        }




    }
}
