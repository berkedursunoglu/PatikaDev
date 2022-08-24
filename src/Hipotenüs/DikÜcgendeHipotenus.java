package Hipotenüs;

import java.util.Scanner;

public class DikÜcgendeHipotenus {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kenar1,kenar2;
        System.out.println("1.Kenar uzunluğunu giriniz: ");
        kenar1 = input.nextInt();
        System.out.println("2.Kenar uzunluğunu giriniz: ");
        kenar2 = input.nextInt();

        double formül = Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));

        System.out.println("Hipotenüs: "+formül);
        System.out.println("Alan "+(kenar1*kenar2)/2);







    }


}
