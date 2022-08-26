package RecursiveDesen;

import java.util.Scanner;

public class RecursiveDesen {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("Sayiyi giriniz : ");
            int sayi = in.nextInt();

            desenPoz(desenNeg(sayi), sayi);

            if (sayi == 0) {
                break;
            }

            System.out.println("\nCikmak icin 0");
        }
    }


    static int desenNeg(int x) {
        if (x <= 0) {
            return x;
        } else {
            System.out.print(x + " ");
            return desenNeg(x - 5);
        }
    }

    static int desenPoz(int x, int y) {
        if (x > y) {
            return x;
        } else {
            System.out.print(x + " ");
            return desenPoz(x + 5, y);
        }

    }

}
