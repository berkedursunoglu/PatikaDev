package UsluSayiHesaplama;

import java.util.Scanner;

public class UsluSayiHesaplama {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sayi1,sayi2,sonuc=1;

        do {
            System.out.println("Sayı giriniz: ");
            sayi1 = in.nextInt();

            System.out.println("Üs giriniz: ");
            sayi2 = in.nextInt();
        }while (sayi1 == 0);



        for (int i=1;i<=sayi2;i++){
            sonuc *= sayi1;
        }

        System.out.println("Sonuc: "+sonuc);
    }
}
