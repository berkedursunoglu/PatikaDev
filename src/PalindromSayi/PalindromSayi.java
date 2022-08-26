package PalindromSayi;

import java.util.Scanner;

public class PalindromSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;

        System.out.println("Palindrom sayı uygulamasına hoşgeldiniz.");
        System.out.println("Bir sayı giriniz: ");
        sayi = input.nextInt();
        System.out.println(palindrom(Integer.toString(sayi)));
    }


    static String palindrom(String str){
        char newStr = '0';
        int loop = str.length();
        String b = "";

        for (int i=loop-1; 0<=i ;i--){
            newStr = str.charAt(i);
            b += newStr;
        }

        return (str.equals(b)) ? "Polindrom Sayıdır." : "Palindrom Sayı değildir.";
    }


}
