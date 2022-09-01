package Siralama;

import java.util.Arrays;
import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Dizi boyutu: ");
        int boyut = in.nextInt();

        int[] dizi = new int[boyut];

        for (int i = 0; i< boyut; i++){
            System.out.println((i+1)+". sayıyı giriniz: ");
            int sayi = in.nextInt();
            dizi[i] = sayi;
        }

        System.out.println("Sıralanmış şekilde sayılarınız...");
        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));

    }
}
