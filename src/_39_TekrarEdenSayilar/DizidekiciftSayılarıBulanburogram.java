package _39_TekrarEdenSayilar;

public class DizidekiciftSayÄ±larÄ±Bulanburogram {
    static boolean isFind(int[] arr, int value) {

        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {99, 7, 1, 2, 4, 3, 1, 10, 76, 100, 32, 99};
        int[] ciftsayi = new int[list.length];
        int baslangic = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (!isFind(ciftsayi, list[i])) {
                        ciftsayi[baslangic++] = list[i];

                    }
                    break;
                }
            }
        }
        for (int value : ciftsayi) {
            if ((value != 0)) {
                System.out.println(value);

            }
        }
    }
}
