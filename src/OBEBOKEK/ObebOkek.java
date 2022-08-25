package OBEBOKEK;

import java.util.Scanner;

public class ObebOkek {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
           int a,b,c,ebob=0,okek=0;

        System.out.println("Birinci sayi: ");
        a = in.nextInt();
        b = in.nextInt();

        if (a < b) {
            c = a;
        } else {
            c = b;
        }
        int i = 1;
        while (i<c) {
            if (a % i == 0 && b % i == 0) {
                ebob = i;
                i++;
            }
        }

        System.out.println("Ebob:"+ebob);

        int d = a*b;

        while (d > 1){
            if (d % a == 0 && d % b == 0) {
                okek = d;
                d--;
            }
        }
        System.out.println("Okek:"+okek);

    }

}
