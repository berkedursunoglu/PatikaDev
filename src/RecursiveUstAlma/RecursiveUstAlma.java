package RecursiveUstAlma;

import java.util.Scanner;

public class RecursiveUstAlma {
    static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        ustAlma();
    }

    static int ustAlma(){
        System.out.println("Taban sayısı giriniz:");
        int taban = in.nextInt();
        System.out.println("Ust sayısı giriniz:");
        int ust = in.nextInt();
        int toplam = 1;

        for (int i=0;i<ust;i++){
            toplam *= taban;
        }

        System.out.println("Sonuc: "+toplam);

        return ustAlma();
    }

}
