
import java.util.Scanner;

public class CarpimTablosu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayi girin carpim tablosu olusturacagım: ");
        int sayi = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(sayi + " . " + i + " = " + (sayi * i));
        }
    }
}
