
import java.util.Scanner;

public class SayılarınOrtalaması {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double toplam = 0;
        int pozitif = 0;
        int negatif = 0;
        int sifir = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("10 adet sayi girin size sayilarin toplamini ortalamasini ve + - notr sayi adedini vereceğim");
            int sayi = scanner.nextInt();
            toplam += sayi;

            if (sayi > 0) {
                pozitif++;
            } else if (sayi < 0) {
                negatif++;
            } else {
                sifir++;
            }
        }

        System.out.println("Toplam: " + toplam);
        System.out.println("Aritmetik ortalama: " + (toplam / 10));
        System.out.println("Pozitif sayi adedi: " + pozitif);
        System.out.println("Negatif sayi adedi: " + negatif);
        System.out.println("Sifir sayisi adedi: " + sifir);
    }
}
