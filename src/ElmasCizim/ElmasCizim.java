package ElmasCizim;

import java.util.Scanner;

public class ElmasCizim {

    public static void main(String[] args) {

        int n,a,b,c;
        Scanner in = new Scanner(System.in);
        System.out.print(" Bir Sayı gırınız : ");
        n = in.nextInt();

        for ( a = 1; a <= n; a++) {
            for ( b = 1; b <= (n - a); b++) {
                System.out.print(" ");

            }
            for ( c = 1; c <= ( 2* a - 1 ); c++) {
                System.out.print("*");

            }
            System.out.println(" ");

        }
        for ( a = 1; a < n; a++) {
            for ( b = 1; b <= a; b++) {
                System.out.print(" ");

            }
            for ( c = 1; c <= ( 2 * n - (2 * a + 1) ); c++) {
                System.out.print("*");

            }
            System.out.println(" ");

        }

    }

}
