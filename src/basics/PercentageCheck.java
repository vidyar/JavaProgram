package basics;

public class PercentageCheck {
    public static void main(String[] args) {
       int s1= 58;
       int s2= 39;
       int s3=49;
       int s4=54;
       int s5=56;
       int Total= 300;
       double Sum , Percentage;
       Sum= s1+s2+s3+s4+s5;
       Percentage = (Sum/Total)*100;
       System.out.println("The Percentage of Student is " + Percentage +"%");
    }

}
