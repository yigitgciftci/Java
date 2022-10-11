import java.util.Scanner;
public class vucutkitle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kilo , boy;
        System.out.print("Kilo(kg): ");
        kilo = input.nextDouble();
        System.out.print("Boy(m): ");
        boy = input.nextDouble();

        double indeks;
        indeks = kilo/(boy*boy);
        System.out.print("Vucut Kitle Indeksi: ");
        System.out.print(indeks);
    }
}
