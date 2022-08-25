package TekSayidanCiftSayi;

import java.util.Scanner;

public class TekSayidanCiftSayi {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int tekSayi,toplam=0;

        do {
            System.out.println("Tek sayi giriniz: ");
            tekSayi = in.nextInt();
            if (tekSayi%2==0 && tekSayi%4==0){
                toplam+= tekSayi;
            }
        }
        while (tekSayi%2==0);

        System.out.println("Girdiğiniz sayilarda ki çift ve 4'ün katı olan sayıların toplamı: "+toplam);

    }
}
