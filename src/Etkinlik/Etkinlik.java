package Etkinlik;

import java.util.Scanner;

public class Etkinlik {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int heat;

        System.out.println("Sıcaklığı giriniz: ");
        heat = input.nextInt();

        if (heat < 5){
            System.out.println("Kayak yapmak için harika.");
        } else if (heat > 5 && heat < 15 ) {
            System.out.println("Sinemeya gitmek için harika.");
        }else  if (heat > 15 && heat < 25){
            System.out.println("Piknik yapmak için harika.");
        }else {
            System.out.println("Yüzme için harika.");
        }

    }
}


