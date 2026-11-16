
import java.util.Scanner;

public class SAyınınBasamaklarınıBulma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir tam sayi girin sayninizin basamak sayisini bulacağim: ");
        String sayi = scanner.next();
        int basamakSayisi = sayi.replace("-", "").length();

        System.out.println("Basamak sayisi: " + basamakSayisi);
    }
}
/*burda integer veya long kullanmamamın sebebi kullanıcı 
bu veri tiplerinin kapsadığı sayı alanından daha büyük
bir sayı girerse sistem çökmesin diye hem kodda hatırı
sayılır derecede kısaldı*/
