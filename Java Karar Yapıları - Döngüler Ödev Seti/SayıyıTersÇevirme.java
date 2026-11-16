
import java.util.Scanner;

public class SayıyıTersÇevirme {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir tam sayi girin tersine cevirip ekrana vereyim: ");
        int sayi = scanner.nextInt();

        int a = 1;
        if (sayi < 0) {
            a = -1;
            sayi = -sayi;
        }

        int ters = 0;
        while (sayi != 0) {
            ters = ters * 10 + (sayi % 10);
            sayi /= 10;
        }

        System.out.println("sayinin ters hali " + (ters * a));
    }
}
/* a değişkenini sayı eğer negatifse diye kullandım sayıyı
en sonda tekrardan negatifo larak versin diye*/
