package MinMax;

import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sayi,sayiAdet,enBuyuk=0,enKucuk=0;

        System.out.println("Kaç tane sayı girilecek: ");
        sayiAdet = in.nextInt();

        for (int i=1; i<=sayiAdet;i++){
            System.out.println(i+". Sayıyı giriniz: ");
            sayi = in.nextInt();
            if (sayi>enBuyuk){
                enBuyuk = sayi;
                enKucuk = sayi;
            }
            if (sayi<enKucuk){
                enKucuk = sayi;
            }
        }

        System.out.println("En büyük sayı: "+enBuyuk);
        System.out.println("En küçük sayı: "+enKucuk);

    }
}
