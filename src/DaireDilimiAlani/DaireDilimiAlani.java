package DaireDilimiAlani;

import java.util.Scanner;

public class DaireDilimiAlani {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double yariCap, merkezYayOlcusu,pi=3.14;

        System.out.println("Yarıçap giriniz: ");
        yariCap = input.nextDouble();
        System.out.println("Merkez yay ölçüsünü giriniz: ");
        merkezYayOlcusu = input.nextDouble();

        double formul = (pi*(yariCap*yariCap)*merkezYayOlcusu)/360;

        System.out.println("Daire dilimi alanı: "+formul);


    }

}
