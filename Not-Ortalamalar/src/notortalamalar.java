import java.util.Scanner;

public class dersnotlari {
    public static void main(String[] args) {
        int mat, turkce  , fizik , muzik , kimya , tarih;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();

        System.out.print("Turkce Notunuz : ");
        turkce = input.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();

        System.out.print("Muzik Notunuz : ");
        muzik = input.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = input.nextInt();

        int ortalama = (mat+turkce+fizik+muzik+kimya+tarih) / 6;

        boolean kosul = ortalama >= 60 ;
        String str = (kosul) ? "Sinifi Gecti" : "Sinifta Kaldi";
        System.out.print(str);
    }
}
