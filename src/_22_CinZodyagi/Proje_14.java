package _22_CinZodyagi;

import java.util.Scanner;

public class Proje_14 {
    public static void main(String[] args) {
        int yil,kalan;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Doğum yılını giriniz:");
        yil=scanner.nextInt();
        kalan=yil%12;

        switch(kalan) {
            case 1:
            {System.out.println("HOROZ");
                break;
            }
            case 2:
            {System.out.println("KÖPEK");
                break;
            }
            case 3:
            {System.out.println("DOMUZ");
                break;
            }

            case 4:
            {System.out.println("FARE");
                break;
            }
            case 5:
            {System.out.println("ÖKÜZ");
                break;
            }
            case 6:
            {System.out.println("KAPLAN");
                break;
            }

            case 7:
            {System.out.println("TAVŞAN");
                break;
            }
            case 8:
            {System.out.println("EJDERHA");
                break;
            }
            case 9:
            {System.out.println("YILAN");
                break;
            }
            case 10:
            {System.out.println("AT");
                break;
            }
            case 11:
            {System.out.println("KOYUN");
                break;
            }
            case 0:
            {System.out.println("MAYMUN");
                break;
            }


        }
    }
}
