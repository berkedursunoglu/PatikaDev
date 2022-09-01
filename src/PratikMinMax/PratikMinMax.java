package PratikMinMax;

import java.util.Arrays;
import java.util.Scanner;

public class PratikMinMax {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};

        Scanner in = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int d = in.nextInt();

        Arrays.sort(list);

        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < d){
                min = i;
            }
        }

        for (int j = list.length-1 ; j >= 0 ; j--){
            if (list[j] >d ){
                max = list[j];
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı " + max);

    }
}
