package ATM;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        String kullaniciAdi, sifre;

        int hak = 3,bakiye = 1500,secim;
        while (hak > 0) {
            System.out.print("Kullanıcı Adınız :");
            kullaniciAdi = in.nextLine();
            System.out.print("Parolanız : ");
            sifre = in.nextLine();
            if (kullaniciAdi.equals("berke") && sifre.equals("berke123")) {
                System.out.println("Berke banka hoşgeldiniz...");
                do {
                    System.out.println("1-Para yatırma "+"2-Para Çekme " + "3-Bakiye Sorgula "+"4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    secim = in.nextInt();
                    switch (secim){
                        case 1:
                            System.out.print("Para miktarı: ");
                            int price = in.nextInt();
                            bakiye += price;
                            break;
                        case 2:
                            System.out.print("Para miktarı: ");
                            int bedel = in.nextInt();
                            if (bedel > bakiye) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                bakiye -= bedel;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + bakiye);
                            break;

                    }

                } while (secim != 4);
                System.out.println("İyi Günler");
                break;
            } else {
                hak--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (hak == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + hak);
                }
            }
        }
    }
}

