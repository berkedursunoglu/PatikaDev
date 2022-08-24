package KucuktenBuyuge;

import java.util.Scanner;

public class KucuktenBuyuge {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sayi1,sayi2,sayi3;
        String siralama = "";

        System.out.println("Birinci sayıyı giriniz: ");
        sayi1 = input.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        sayi2 = input.nextInt();
        System.out.println("Üçüncü sayıyı giriniz: ");
        sayi3 = input.nextInt();

        if (sayi1<sayi2 && sayi1<sayi3){
            if (sayi2<sayi3){
                siralama += ""+sayi1+"<"+sayi2+"<"+sayi3;
            }else {
                siralama += ""+sayi1+"<"+sayi3+"<"+sayi2;
            }
        } else if (sayi2<sayi1 && sayi2<sayi3) {
            if (sayi1<sayi3){
                siralama += ""+sayi2+"<"+sayi1+"<"+sayi3;
            }else {
                siralama += ""+sayi2+"<"+sayi3+"<"+sayi1;
            }
        } else {
            if (sayi1<sayi2){
                siralama += ""+sayi3+"<"+sayi1+"<"+sayi2;
            }else {
                siralama += ""+sayi3+"<"+sayi2+"<"+sayi1;
            }
        }

        System.out.println(siralama);

    }

}
