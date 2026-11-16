
import java.util.Scanner;

public class çifttektoplam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayi girin (N) 1 ile N arasindaki cift ve tek sayilarin toplamlarini ayri ayri hesaplayacagim");

        int n = sc.nextInt();
        int ciftToplam = 0;
        int tekToplam = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                ciftToplam += i;
            } else {
                tekToplam += i;
            }
        }

        System.out.println("Cift sayilarin toplami: " + ciftToplam);
        System.out.println("Tek sayilarin toplami: " + tekToplam);
    }
}
