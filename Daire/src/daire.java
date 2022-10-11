import java.util.Scanner;
public class daire {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r , a;

        System.out.print("Yaricap: ");
        r =input.nextInt();
        System.out.print("Merkez Acisi: ");
        a =input.nextInt();

        double π;
        π = 3.14;

        double alan, cevre;
        alan = π * r * r;
        cevre = 2 * π * r;

        double diliminalani;
        diliminalani = (π * r*r * a) / 360;

        System.out.print("alan: ");
        System.out.println(alan);

        System.out.print("cevre: ");
        System.out.println(cevre);

        System.out.print("diliminalani: ");
        System.out.println(diliminalani);

    }
}
