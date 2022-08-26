package RecursiveAsalSayi;

import java.util.Scanner;

public class RecursiveAsalSayi {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        asalSayi();
    }

    static String asalSayi() {

        System.out.println("Sayi giriniz: ");
        int d = in.nextInt();

        int sayac = 0;
        for (int j = d; j >= 1; j--) {
            if (d % j == 0) {
                sayac++;
            }
        }
        if (sayac == 2) {
            System.out.println("Girilen sayı asal sayıdır.");
        } else {
            System.out.println("Girilen sayı asal sayı değildir.");
        }


        return asalSayi();
    }


}

