package ArtıkYıl;

import java.util.Scanner;

public class ArtikYil {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil;

        System.out.println("Yıl giriniz: ");
        yil = input.nextInt();

        if (yil%400==0){
            System.out.println(yil+" yılı artık yıldır.");
        }else {
            System.out.println(yil+" yılı artık değildir..");
        }


    }
}
