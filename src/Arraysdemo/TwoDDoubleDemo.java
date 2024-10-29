package Arraysdemo;

public class TwoDDoubleDemo {
    public static void main(String[] args) {
        double [][] a = new double[4][3];

        a[0][0] = 33.3;
        a[0][1] = 56;
        a[0][2] = 0.34;

        a[1][0] = 66;
        a[1][1] = 444.64;
        a[1][2] = 5.3333;

        a[2][0] = 100;
        a[2][1] = 333.4665;
        a[2][2] = 45;

        a[3][0] = 443;
        a[3][1] = 34.654;
        a[3][2] = 455;

        int row = a.length;
        int col = a[0].length;

        for(int i=0;i<a.length;i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
