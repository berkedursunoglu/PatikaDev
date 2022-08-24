package SinifGecmeDurumu;

import java.util.Scanner;

public class SinifGecmeDurumu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matematik,fizik,turkce,kimya,muzik;
        int sonuc=0,gecme;
        System.out.println("Matematik notunuzu giriniz: ");
        matematik = input.nextInt();
        System.out.println("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        System.out.println("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();
        System.out.println("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        System.out.println("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();

        if (matematik>0 && matematik<100){
            sonuc += matematik;
        }
        if (fizik>0 && fizik<100){
            sonuc += fizik;
        }
        if (turkce>0 && turkce<100){
            sonuc += turkce;
        }
        if (kimya>0 && kimya<100){
            sonuc += kimya;
        }
        if (muzik>0 && muzik<100){
            sonuc += muzik;
        }

        gecme = sonuc/5;

        if (gecme > 55){
            System.out.println("Geçtiniz.");
        }else {
            System.out.println("Kaldınız.");
        }




    }
}
