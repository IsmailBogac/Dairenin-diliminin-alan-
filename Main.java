import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        int r;
        double pi =3.14,alan,a,cevre,alan2;
        // Dairenin alanı ve çevresi
        Scanner input = new Scanner(System.in);
        System.out.print("Darirenin yarıçapını giriniz :");
        r=input.nextInt();
        alan = pi*r*r;
        cevre = 2*pi*r;
        System.out.println("Dairenin  alanı :"+ alan);
        System.out.println("Dairenin çevresi :"+ cevre);
        // Dairenin dilim alanı
        Scanner input2 = new Scanner(System.in);
        System.out.print("Darirenin dilim açısını giriniz :");
        a=input2.nextInt();
        alan2 = (pi * (r*r) * a ) / 360 ;;
        System.out.print("Dairenin dilim alanı :" + alan2);



    }
}