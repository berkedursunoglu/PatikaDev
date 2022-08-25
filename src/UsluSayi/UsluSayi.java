package UsluSayi;

import java.util.Scanner;

public class UsluSayi {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input,sayi4,sayi5;
        System.out.println("Bir sayı giriniz: ");
        input = in.nextInt();

        for (int i = 0 ; i < input ; i++){
            sayi4 = 4;
            sayi5 = 5;
            for (int j = 1; j <= i ;j++){
                sayi4 *= 4;
                sayi5 *= 5;
            }
            System.out.println("4'ün "+(i+1)+". kuvveti: "+sayi4+"\t 5'in "+(i+1)+". kuvveti: "+sayi5);
        }


    }
}
