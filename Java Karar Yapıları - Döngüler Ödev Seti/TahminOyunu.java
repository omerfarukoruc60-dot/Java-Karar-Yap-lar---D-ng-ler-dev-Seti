
import java.util.Scanner;

public class TahminOyunu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gizliSayi = 42;
        int tahmin = 0;

        System.out.println("1 ile 100 arasinda bir sayi tahmin edin.");

        while (tahmin != gizliSayi) {
            System.out.print("Tahmininiz: ");
            tahmin = scanner.nextInt();

            if (tahmin < gizliSayi) {
                System.out.println("Daha buyuk bir sayi girin.");
            } else if (tahmin > gizliSayi) {
                System.out.println("Daha kucuk bir sayi girin.");
            } else {
                System.out.println("Dogru tahmin!");
            }
        }
    }
}
