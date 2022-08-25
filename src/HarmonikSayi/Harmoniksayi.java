package HarmonikSayi;

import java.util.Scanner;

public class Harmoniksayi {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        double sonuc=0;

        System.out.println("Harmonik hesaplama için sayı giriniz: ");
        n = in.nextInt();

        for (double i= 1; i<=n ; i++){
            sonuc += (1/i);
        }

        System.out.println("Sonuc: "+sonuc);
    }

}
