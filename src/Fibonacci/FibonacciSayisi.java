package Fibonacci;

import java.util.Scanner;

public class FibonacciSayisi {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int basamak,a=0,b=1,c;

        System.out.println("Fibonacci serisinin eleman sayısını yazınız: ");
        basamak = in.nextInt();

        for (int i = 2  ;i<=basamak;i++){
            c=a+b;
            System.out.print(a + " + " +b + " = "+c);
            a=b;
            b=c;
            System.out.println();
        }
    }

}
