package KDVTutari;

import java.util.Scanner;

public class KDVTutari {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kdv;
        double ucret;
        boolean kosul;

        System.out.println("Ücret Tutarını giriniz: ");
        ucret = input.nextDouble();

        kosul = ucret > 1000;

        kdv = kosul ? 0.08 : 0.18;

        System.out.println("KDV'li fiyatı: "+((ucret*kdv)+ucret));




    }
}
