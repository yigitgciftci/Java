import java.util.Scanner;
public class kdvhes {
    public static void main(String[] args) {
        double kdv, fiyat;
        boolean kosul;

        Scanner input = new Scanner(System.in);
        System.out.print("Fiyat giriniz:");
        fiyat = input.nextInt();

        kosul = fiyat <= 1000;

        kdv = kosul ? 0.18 * fiyat : 0.08 * fiyat;

        System.out.print("Kdv miktari: " + kdv);

    }
}

