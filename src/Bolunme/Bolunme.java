package Bolunme;

import java.util.Scanner;

public class Bolunme {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input,sayac=0;
        double sonuc=0;
        System.out.println("Sayı giriniz: ");
        input = in.nextInt();

        for (int i=1; i<input;i++){
            if (i%3==0 || i%4==0){
                sonuc +=i;
                sayac++;
            }
        }

        System.out.println(input+"'a kadar olan 3ve4'e tam bölünen sayıların ortalaması: "+sonuc/sayac);

    }
}
