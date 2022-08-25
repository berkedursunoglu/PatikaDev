package AsalSayilar;

import java.util.Scanner;

public class AsalSayilar {
    public static void main(String[] args) {

        String asalSayi = "";

        for (int i = 1; i <= 100; i++) {
            int sayac = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    sayac++;
                }
            }
            if (sayac == 2) {
                asalSayi = asalSayi + i + " ";
            }
        }
        System.out.println(asalSayi);
    }


}

