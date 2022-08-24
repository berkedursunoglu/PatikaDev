package UcakBileti;

import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mesafe, yas, yolculuktipi;
        double promosyonsuzUcret, biletFiyati = 0.0;

        System.out.println("Yasınız: ");
        yas = input.nextInt();
        System.out.println("Yolculuk tipi (Tek yön 1, Gidiş-Dönüş 2): ");
        yolculuktipi = input.nextInt();
        System.out.println("Gidilecek Mesafe(Km): ");
        mesafe = input.nextInt();

        promosyonsuzUcret = mesafe * 0.10;

        if (mesafe < 0 || yas < 0 || (yolculuktipi != 1 && yolculuktipi != 2)) {
            System.out.println("Hatalı veriler girildi.");
        } else {
            if (yas <= 24) {
                if (yas > 12) {
                    if (yolculuktipi == 2){
                        biletFiyati += (promosyonsuzUcret - (promosyonsuzUcret * (0.2)) );
                    }else {
                        biletFiyati += (promosyonsuzUcret - (promosyonsuzUcret * (0.1)) );
                    }
                } else {
                    if (yolculuktipi ==2 ){
                        biletFiyati += (promosyonsuzUcret -(promosyonsuzUcret * (0.1)) );
                    }else {
                        biletFiyati += ( promosyonsuzUcret - (promosyonsuzUcret * (0.5)));
                    }
                }

            } else if(yas>=65) {
                if (yolculuktipi == 2){
                    biletFiyati += ((promosyonsuzUcret - promosyonsuzUcret * (0.6)) );
                }else {
                    biletFiyati += ( promosyonsuzUcret- (promosyonsuzUcret * (0.3)));
                }
            }
        }
        System.out.println("Bilet fiyatınız: "+biletFiyati);
    }
}
