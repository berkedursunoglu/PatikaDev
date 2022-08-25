package Kombinasyon;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sayi1,sayi2,sayi3,sayi1fac= 1,sayi2fac=1,sayi3fac=1;

        do {
            System.out.println("Kombinasyon için iki sayı giriniz: (n'ci sayının b'ci kombinasyonu şeklinde):");
            sayi1 = in.nextInt();
            sayi2 = in.nextInt();
            if (sayi2>sayi1){
                System.out.println("İlk sayıyı küçük giremezsiniz...");
            }
            sayi3 = sayi1-sayi2;
        }while (sayi2>sayi1);


        for(int i= 1; i<=sayi1;i++){
            sayi1fac *= i;
        }

        for(int i= 1; i<=sayi2;i++){
            sayi2fac *= i;
        }

        for(int i= 1; i<=sayi3;i++){
            sayi3fac *= i;
        }

        int formul = sayi1fac / (sayi2fac * (sayi3fac));

        System.out.println("C("+sayi1+","+sayi2+")"+" kombinasyonu: "+formul);


    }
}
   // C(n,r) = n! / (r! * (n-r)!)