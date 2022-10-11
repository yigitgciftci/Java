import java.util.Scanner;
public class dikucgen {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        double a , b;
        System.out.print("a= ");
        a = input.nextDouble();
        System.out.print("b= ");
        b = input.nextDouble();

        double c =Math.sqrt(a*a+b*b);
        System.out.print("Hipotenus: ");
        System.out.println(c);

        double u = (a+b+c)/2;
        System.out.print("u: ");
        System.out.println(u);

        double cevre = 2*u;
        System.out.print("Cevre: ");
        System.out.println(cevre);

        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.print("Alan: ");
        System.out.println(alan);




    }

}

