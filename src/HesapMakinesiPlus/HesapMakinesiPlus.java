package HesapMakinesiPlus;

import java.util.Scanner;

public class HesapMakinesiPlus {
    static Scanner in = new Scanner(System.in);
    static String menu = "1- Toplama İşlemi\n"
            + "2- Çıkarma İşlemi\n"
            + "3- Çarpma İşlemi\n"
            + "4- Bölme işlemi\n"
            + "5- Üslü Sayı Hesaplama\n"
            + "6- Faktoriyel Hesaplama\n"
            + "7- Mod Alma\n"
            + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
            + "0- Çıkış Yap";

    public static void main(String[] args) {

        System.out.println("Hesap makinesi plus uygulamasına hoşgeldin..");
        System.out.println(menu);
        System.out.print("İşlem seçiniz: ");
        int input = in.nextInt();

        switch (input){
            case 1:
                System.out.println("Sonuc: "+toplama());
                break;
            case 2:
                System.out.println("Sonuc: "+cikarma());
                break;
            case 3:
                System.out.println("Sonuc: "+carpma());
                break;
            case 4:
                System.out.println("Sonuc: "+bolme());
                break;
            case 5:
                System.out.println("Sonuc: "+usAlma());
                break;
            case 6:
                System.out.println("Sonuc: "+faktroriyel());
                break;
            case 7:
                System.out.println("Sonuc: "+modAlma());
                break;
            case 8:
                dikdortgenAlanVeCevre();
                break;
            case 0:
                System.out.println("Çıkış yapıldı...");
                break;
            default:
                System.out.println("Uygun olmayan bir tuşlama yapıldı.");
                break;

        }

    }


    static int toplama(){
        System.out.println("Kaç adet sayı girilecek: ");
        int n = in.nextInt();
        int toplama = 0;

        for (int i=0; i<n;i++){
            toplama += in.nextInt();
        }
        return toplama;
    }

    static int cikarma(){
        System.out.println("Kaç adet sayı girilecek: ");
        int n = in.nextInt();
        int cikarma = 0;

        for (int i=0; i<n;i++){
            cikarma -= in.nextInt();
        }
        return cikarma;
    }

    static int carpma(){
        System.out.println("Kaç adet sayı girilecek: ");
        int n = in.nextInt();
        int carpma = 1;

        for (int i=0; i<n;i++){
            carpma *= in.nextInt();
        }
        return carpma;
    }

    static double bolme(){
        System.out.println("1.Sayıyı giriniz: ");
        int sayi1 = in.nextInt();
        System.out.println("2.Sayıyı giriniz: ");
        int sayi2 = in.nextInt();
        double bolme = 0;

        bolme = sayi1/sayi2;
        return bolme;
    }

    static int usAlma(){
        System.out.println("Taba sayıyısı: ");
        int sayi = in.nextInt();
        System.out.println("Üst sayıyısı: ");
        int n = in.nextInt();


        for (int i=1; i<n;i++){
            sayi *= sayi;
        }
        return sayi;
    }

    static int faktroriyel(){
        System.out.println("Sayıyı giriniz: ");
        int sayi = in.nextInt();
        int sonuc= 1;


        for (int i=1; i<=sayi;i++){
            sonuc *=sayi;
        }
        return sonuc;
    }

    static int modAlma(){
        System.out.println("1. Sayıyı giriniz: ");
        int sayi1 = in.nextInt();
        System.out.println("2. Sayıyı giriniz: ");
        int sayi2 = in.nextInt();

        int sonuc= sayi1%sayi2;

        return sonuc;
    }

    static void dikdortgenAlanVeCevre(){
        System.out.println("Uzun kenar giriniz: ");
        int sayi1 = in.nextInt();
        System.out.println("Kısa kenar giriniz: ");
        int sayi2 = in.nextInt();

        int cevre = 2*sayi1 + 2*sayi2;
        int alan = sayi1*sayi2;

        System.out.println("Dikdörtgenin alanı: "+alan);
        System.out.println("Dikdörtgenin cevresi: "+cevre);

    }




}
