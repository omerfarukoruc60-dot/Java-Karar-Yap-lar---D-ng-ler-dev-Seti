
import java.util.Scanner;

class BirdenNekadar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayi soyleyin 1den sizin sayiniza kadar olan tum tam sayilari ekrana getireyim");

        int N = sc.nextInt();

        if (N < 1) {
            System.out.println("Lutfen 1 veya daha buyuk bir sayi girin.");
            return;
        }

        int toplam = 0;

        for (int i = 1; i <= N; i++) {
            System.out.println(i);
            toplam++;
        }

        System.out.println("Sizin sayiniza kadar toplamda " + toplam + " adet sayi var.");
    }
}
