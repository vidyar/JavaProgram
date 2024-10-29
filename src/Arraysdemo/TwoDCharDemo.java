package Arraysdemo;

public class TwoDCharDemo {
    public static void main(String[] args) {
        char[][] a = new char[4][3];

        a[0][0] = '2';
        a[0][1] = 'k';
        a[0][2] = '$';

        a[1][0] = '4';
        a[1][1] = '&';
        a[1][2] = 'H';

        a[2][0] = '#';
        a[2][1] = '9';
        a[2][2] = 'n';

        a[3][0] = 'm';
        a[3][1] = '^';
        a[3][2] = '6';

        int row = a.length;
        int col = a[0].length;

        for(int i=0;i<a.length;i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }

    }

}
