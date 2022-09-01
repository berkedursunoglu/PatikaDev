package ArrayOrtalama;

import java.util.Scanner;

public class ArrayOrtlama {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Kaç sayı girilecek: ");
        int size = in.nextInt();
        double sonuc = 0;
        int[] d = new int[size];

        for (int i = 0; i<size ; i++){
            System.out.println(i+1 + ". Sayıyı giriniz:  ");
            d[i] = in.nextInt();
        }

        for (int j = 0 ; j<size ;j++){
            for (double i= 1; i<=d[j] ; i++){
                sonuc += (1/i);
            }
            System.out.println("Dizedeki "+ (j+1) + ". sayının harmonik ortalaması: "+sonuc);
        }



    }

}
