package PalindromKelime;

import java.util.Scanner;

public class PalindromKelime {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Kelimeyi giriniz");
        String str = in.nextLine();


        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse))
            System.out.println("Palindrom");
        else
            System.out.println("Palindrom değildir.");

    }
}
