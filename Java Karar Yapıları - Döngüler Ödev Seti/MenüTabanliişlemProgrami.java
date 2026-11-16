
import java.util.Scanner;

public class MenüTabanliişlemProgrami {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secim = 0;

        while (secim != 5) {
            System.out.println("1: gireceğiniz sayinin karesini hesaplamak için 1i seçin.");
            System.out.println("2: gireceğiniz sayinin küpünü hesaplamak için 2yi seçin.");
            System.out.println("3: gireceğiniz sayinin tek veya çift olduğunu kontrol etmek için 3ü seçin.");
            System.out.println("4: gireceğiniz sayinin pozitif, negatif veya sifir olduğunu belirlemek için 4ü seçin.");
            System.out.println("5: programdan cikmak için 5i seçin.");
            System.out.print("seçiminiz ");
            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.print("bir sayi girin: ");
                    int kareSayisi = scanner.nextInt();
                    System.out.println("karesi: " + (kareSayisi * kareSayisi));
                    break;
                case 2:
                    System.out.print("bir sayi girin: ");
                    int kupSayisi = scanner.nextInt();
                    System.out.println("küpü: " + (kupSayisi * kupSayisi * kupSayisi));
                    break;
                case 3:
                    System.out.print("bir sayi girin: ");
                    int tekCiftSayisi = scanner.nextInt();
                    if (tekCiftSayisi % 2 == 0) {
                        System.out.println("sayi çifttir.");
                    } else {
                        System.out.println("sayi tektir.");
                    }
                    break;
                case 4:
                    System.out.print("bir sayi girin: ");
                    int isaretSayisi = scanner.nextInt();
                    if (isaretSayisi > 0) {
                        System.out.println("sayi pozitiftir.");
                    } else if (isaretSayisi < 0) {
                        System.out.println("sayi negatiftir.");
                    } else {
                        System.out.println("sayi sifirdir.");
                    }
                    break;
                case 5:
                    System.out.println("programdan cikiliyor.");
                    break;
                default:
                    System.out.println("geçersiz seçim tekrar deneyin");
            }
        }
    }
}
