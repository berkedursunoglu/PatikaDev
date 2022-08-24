package Sifre;

import java.util.Scanner;

public class Sifre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputKullaniciAdi, inputSifre;
        String yeniSifre="2";
        int secenek=0;

        System.out.println("Kullanıcı adını giriniz:");
        inputKullaniciAdi = input.nextLine();
        System.out.println("Şifre giriniz: ");
        inputSifre = input.nextLine();

        if (inputKullaniciAdi.equals("berke") && inputSifre.equals("berke123")) {
            System.out.println("Giriş başarılı");
        } else {
            System.out.println("Şifre yalnış değiştirmek istiyorsanız 1'e basınız: ");
            secenek = input.nextInt();
        }

        if (secenek == 1) {
            System.out.print("Yeni şifreyi giriniz: \n");
            yeniSifre = input.next();

            if (yeniSifre.equals("berke123")) {
                System.out.println("Şifre oluşturulamadı başka şifre koyunuz.");
                yeniSifre = input.next();
                System.out.println("Şifreniz başarıyla değiştirildi.");
            } else {
                System.out.println("Şifreniz başarıyla değiştirildi.");
            }

        }
    }
}


    /*
    Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
    eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile
    aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
    sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
     */