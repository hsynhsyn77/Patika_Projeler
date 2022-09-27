package _15_Atm;

import java.util.Scanner;

public class Proje_24 {
    public static void main(String[] args) {
        int bakiye = 1000, toplam = 0, q = 3;
        while (q > 0) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Kullanıcı adı giriniz: ");
            String t = scanner.nextLine();
            System.out.print("Şifre giriniz: ");
            String k = scanner.nextLine();

            if (t.equals("hsyn") && k.equals("1234")) {
                System.out.print(" Bankamıza Hoşgeldiniz.\nYapmak istediğiniz işlem seçiniz\n");
                System.out.println("Para yatırma için 1, " +
                        "\nPara çekmek için 2,\nBakiye sorgulama için 3,\nÇıkış için 4 basınız.");

                int a = scanner.nextInt();
                switch (a) {
                    case 1:
                        System.out.println("Para miktarı: ");
                        int b = scanner.nextInt();
                        bakiye += b;
                        System.out.print("Bakiyeniz " + bakiye);
                        break;
                    case 2:
                        System.out.println("Çekme istediğiniz tutar: ");
                        int h = scanner.nextInt();
                        if (h > bakiye) {
                            System.out.println("Yetersiz bakiye");
                            break;
                        } else {
                            bakiye -= h;
                            System.out.println("Bakiyeniz: " + bakiye);
                        }
                        break;

                    case 3:
                        System.out.println("Mevcut Bakiyeniz: " + bakiye);
                        break;
                    case 4:
                        System.out.println("İyi günler. Yine bekleriz...");
                        break;
                }


            } else {
                q--;
                System.out.println("Hatalı kullanıcı veya şifre girdiniz tekrar deneyiniz.");
                if (q == 0)
                    System.out.println("Hesabınız bloke oldu. Bankayla iletişime geçiniz.");
            }
        }
    }
}
