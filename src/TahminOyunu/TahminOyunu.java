package TahminOyunu;

import java.util.Random;
import java.util.Scanner;

public class TahminOyunu {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int sayi = rnd.nextInt(100);
        System.out.println(sayi);

        int game = 5;
        System.out.println("Sayı tahmin oyunu..");
        System.out.println("5 tahmin hakkınız vardır. Oyun başlıyor..");
        while (game > 0) {
            System.out.println("Tahmininiz nedir?");
            int tahmin = in.nextInt();
            if (tahmin == sayi) {
                System.out.println("Tebrikler doğru bildiniz..");
                break;
            }else {
                if (tahmin<sayi){
                    System.out.println("Tahmininiz sayıdan küçük");

                }else {
                    System.out.println("Tahmininiz sayıdan büyük");
                }
                System.out.println("Yanlış cevap tekrar deneyin: ");
                System.out.println("Kalan tahmin: "+(game-1));
                game--;

            }
        }

        if (game == 0){
            System.out.println("Malesef bilemeziniz...");
        }


    }


}
