import java.util.Scanner;
public class taksimetre {
    public static void main(String[] args) {
        int km;
        double ucret;
        boolean kosul;

        Scanner input = new Scanner(System.in);
        System.out.print("km: ");
        km = input.nextInt();

        ucret = 10 + km*2.20;

        kosul = ucret < 20;

        ucret = kosul ? 20 : ucret;

        System.out.print("Odenecek Tutar: ");
        System.out.print(ucret);
    }
}
