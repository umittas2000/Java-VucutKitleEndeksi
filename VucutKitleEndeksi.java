import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double boy,kilo,kitleEndeksi;

        System.out.print("Boyunuzu giriniz (m): ");
        boy = input.nextDouble();

        System.out.print("Kilonuzu giriniz(kg): ");
        kilo = input.nextDouble();

        kitleEndeksi = kilo / (boy * boy);

        System.out.print("Vucut Kitle Endeksiniz: " + kitleEndeksi);
    }
}
