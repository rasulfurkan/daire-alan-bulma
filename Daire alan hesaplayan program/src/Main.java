import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int r, a ;
        double pi = 3.14;
        Scanner inp = new Scanner(System.in);
        System.out.println("iç açıyı girin = ");
        a = inp.nextInt();
        System.out.println("yarıçapı girin = ");
        r = inp.nextInt();

        double alan = (pi*(r*r)*a)/360 ;
        double cevre = 2*pi*r ;

        System.out.println("Alan = " + alan);
        System.out.println("Cevre = " + cevre);


    }
}