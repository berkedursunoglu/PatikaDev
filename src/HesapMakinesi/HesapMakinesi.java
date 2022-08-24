package HesapMakinesi;

import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sayi1, sayi2, sonuc;
        int islem;

        System.out.println("1.Sayıyı giriniz: ");
        sayi1 = input.nextDouble();
        System.out.println("2.Sayıyı giriniz: ");
        sayi2 = input.nextDouble();
        System.out.println("Toplama için \"1\", Çıkarma için \"2\", Çarpma için \"3\", Bölme için \"4\": ");
        islem = input.nextInt();

        switch (islem) {
            case 1:
                System.out.println("Sonuc: "+(sayi1+sayi2));
                break;
            case 2:
                System.out.println("Sonuc: "+(sayi1-sayi2));
                break;
            case 3:
                System.out.println("Sonuc: "+(sayi1*sayi2));
                break;
            case 4:
                if (sayi1 == 0 || sayi2 == 0){
                    System.out.println("0 ile bölme işlemi yapılamaz.");
                }
                System.out.println("Sonuc: "+(sayi1/sayi2));
                break;
        }

    }


}
