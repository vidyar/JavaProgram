package controlStructure;

public class PrintResult {
    public static void main(String[] args) {
        int marks = 56;

        if(marks<40)
        {
            System.out.println(" The result is Failed and marks = " + marks);
        } 
        else if (marks>=40 && marks < 50) 
        {
            System.out.println("The result is Passed and marks = " + marks);
        } else if (marks>=50 && marks < 60)
        {
            System.out.println("The result is Second class and marks = " + marks);
            
        }
        else if (marks>=60 && marks < 75)
        {
            System.out.println("The result is First class and marks = " + marks);

        }
        else if (marks>=75)
        {
            System.out.println("The result is Distinction and marks = " + marks);

        }
    }
}
