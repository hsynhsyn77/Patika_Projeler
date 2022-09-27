package _24_UcakBiletiHesaplayanUygulama;

import java.util.Scanner;

public class Proje_13 {
    public static void main(String[] args) {
        int mesafe , yas , yolculuktipi;
        double normaltutar , yasindirimi1 ,yasindirimi2 ,yasindirimi3, gidisdonusindirimi,geneltutar;
        Scanner input= new Scanner(System.in);
        System.out.println("Mesafeyi km olarak giriniz :");
        mesafe =input.nextInt();
        System.out.println("Yaş giriniz :");
        yas =input.nextInt();
        System.out.println("Yolculuk tipini giriniz (1=> Tek Yon, 2=> Gidis-Donus :");
        yolculuktipi =input.nextInt();
        if( mesafe < 0 || yas < 0 || yolculuktipi <0 || yolculuktipi>2 ) {

            System.out.println("Hatalı Veri Girdiniz !");
        }
        normaltutar=mesafe * 0.10;
        yasindirimi1 =normaltutar *0.50;
        yasindirimi2  =normaltutar *0.10;
        yasindirimi3 = normaltutar *0.30;

        if (yas<=12 && yas>0 && yolculuktipi == 1 && mesafe>0 )
        {
            geneltutar= normaltutar -yasindirimi1;
            System.out.println(geneltutar);
        }
        else if (yas<12 && yolculuktipi == 2  && mesafe>0) {
            gidisdonusindirimi =(normaltutar-yasindirimi1) *0.20;
            geneltutar= normaltutar - (yasindirimi1+gidisdonusindirimi);
            geneltutar= geneltutar*2;
            System.out.println(geneltutar);
        }
        if ( yas <24 && yas>12 && yolculuktipi == 1  && mesafe>0)
        {
            geneltutar= normaltutar -yasindirimi2;
            System.out.println(geneltutar);
        }
        else if (yas <24 && yas>12 && yolculuktipi == 2  && mesafe>0) {
            gidisdonusindirimi =(normaltutar-yasindirimi2) *0.20;
            geneltutar= normaltutar - (yasindirimi2+gidisdonusindirimi);
            geneltutar= geneltutar*2;
            System.out.println(+geneltutar);

        }
        if ( yas >24  && yas <65 && yolculuktipi == 1 && mesafe>0 )
        {

            System.out.println(normaltutar);
        }
        else if (yas <24 && yas>12 && yolculuktipi == 2  && mesafe>0) {
            geneltutar =normaltutar*2;
            System.out.println(+geneltutar);

        }
        if (yas>65 && yolculuktipi == 1  && mesafe>0)
        {
            geneltutar= normaltutar -yasindirimi3;
            System.out.println(geneltutar);
        }
        else if (yas<12 && yolculuktipi == 2 && mesafe>0 ) {
            gidisdonusindirimi =(normaltutar-yasindirimi3) *0.20;
            geneltutar= normaltutar - (yasindirimi3+gidisdonusindirimi);
            geneltutar= geneltutar*2;
            System.out.println(geneltutar);
        }


    }
}
