package NotOrtalamasi;

import java.util.Scanner;

public class NotOrtalamasi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matematik,fizik,kimya,turkce,tarih,muzik,toplam;
        boolean sonuc;



        System.out.println("Matematik notunuz: ");
        matematik = input.nextInt();
        System.out.println("Fizik notunuz: ");
        fizik = input.nextInt();
        System.out.println("Kimya notunuz: ");
        kimya = input.nextInt();
        System.out.println("Türkçe notunuz: ");
        turkce = input.nextInt();
        System.out.println("Tarih notunuz: ");
        tarih = input.nextInt();
        System.out.println("Müzik notunuz: ");
        muzik = input.nextInt();

        toplam = (matematik+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println("Not ortalamanız: "+toplam);

        sonuc = toplam>=60;

        String str = sonuc ? "Geçtiniz" : "Kaldınız";

        System.out.println(str);

    }


}
