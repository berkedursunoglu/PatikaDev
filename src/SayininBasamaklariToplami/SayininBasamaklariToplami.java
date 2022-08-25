package SayininBasamaklariToplami;

import java.util.Scanner;

public class SayininBasamaklariToplami {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input,toplam = 0,bolum;

        System.out.println("Sayı giriniz: ");
        input = in.nextInt();
        bolum = input;

        while (input>0){
            toplam += input%10;
            input /= 10;
        }
        System.out.println(toplam);
    }
}
