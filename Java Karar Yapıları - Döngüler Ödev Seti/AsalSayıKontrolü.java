
import java.util.Scanner;

class AsalSayıKontrolü {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi girin asal mi değig mi bakalim: ");

        int sayi = input.nextInt();
        boolean asal = sayi >= 2;

        for (int bolen = 2; asal && bolen <= sayi / bolen; bolen++) {
            if (sayi % bolen == 0) {
                asal = false;
            }
        }

        if (asal) {
            System.out.println("Asal");
        } else {
            System.out.println("Asal degil");
        }
    }
}
