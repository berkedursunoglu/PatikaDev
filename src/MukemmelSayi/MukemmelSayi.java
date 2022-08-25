package MukemmelSayi;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int girilenSayi,toplam=0;
        boolean durum=true;

        System.out.println("Sayi giriniz: ");
        girilenSayi = in.nextInt();

        for (int i = 1; i<girilenSayi;i++){
            if (girilenSayi%i==0){
                toplam += i;
            }
        }

        if (toplam != girilenSayi){
            durum = false;
        }

        String str = durum ? girilenSayi+" Mükemmel sayıdır." : girilenSayi+" Mükemmel sayı değildir.";

        System.out.println(str);


    }
}
