package Taksimetre;

import java.util.Scanner;

public class Taksimetre {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int acilisUcreti = 10,minimumUcret=20;
        double gidilenYol,kmUcreti=2.20,tutar;

        System.out.println("Gidilen yol(Km): ");
        gidilenYol = input.nextInt();

         tutar = (gidilenYol*kmUcreti) + acilisUcreti ;
         boolean kosul = tutar > minimumUcret;
         String odenecekTutar = kosul ? ""+tutar : "20TL";
        System.out.println("Odenecek tutar "+odenecekTutar+"TL");




    }
}
