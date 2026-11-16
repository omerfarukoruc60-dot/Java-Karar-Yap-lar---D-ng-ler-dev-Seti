
import java.util.Scanner;

public class FaktöriyelHesaplama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayi girin faktöriyelini hesaplayacağim: ");
        int sayi = scanner.nextInt();
        int faktoriyel = 1;

        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;
        }

        System.out.println(sayi + "! = " + faktoriyel + "hesaplanan sayi");
    }
}
