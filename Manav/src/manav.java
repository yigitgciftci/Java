import java.util.Scanner;
public class manav {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int armut , elma , domates , muz , patlican;
        System.out.print("Armut kac kg ? ");
        armut = input.nextInt();
        System.out.print("Elma kac kg ? ");
        elma = input.nextInt();
        System.out.print("Domates kac kg ? ");
        domates = input.nextInt();
        System.out.print("Muz kac kg ? ");
        muz = input.nextInt();
        System.out.print("Patlican kac kg ? ");
        patlican = input.nextInt();

        double tutar;

        tutar = 2.14*armut + 3.67*elma + 1.11*domates + 0.95*muz + 5*patlican;

        System.out.print("Odenecek Tutar: " + tutar);



    }
}
