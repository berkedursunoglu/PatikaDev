package TersYildiz;

import java.util.Scanner;

public class TersYildiz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int basamak;

        System.out.println("Ters üçgen için basamak sayısı giriniz: ");
        basamak = in.nextInt();


        for (int a = 1; a < basamak; a++) {
            for ( int b = 1; b <= a; b++) {
                System.out.print(" ");

            }
            for (int c = 1; c <= ( 2 * basamak - (2 * a + 1) ); c++) {
                System.out.print("*");

            }
            System.out.println(" ");

        }
    }

}

