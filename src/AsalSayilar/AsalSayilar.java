package AsalSayilar;

import java.util.Scanner;

public class AsalSayilar {
    public static void main(String[] args) {
        int i = 2;

        do {
            if (i%2 !=0 && i%3 !=0){
                System.out.print(i+" ");
            }
            i++;
        } while (i<100);


    }
}
