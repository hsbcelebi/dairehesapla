import java.util.Scanner;

public class DaireHesap {

    public static void main(String[] args) {

        float pi = (float) 3.14;
        float r ;
        float a;


        Scanner scan = new Scanner(System.in);

        System.out.println("Yarıçapı giriniz : " );
        r=scan.nextFloat();

        System.out.println("Merkez açı ölçüsü giriniz : " );
        a=scan.nextFloat();

        float cevre = 2*pi*r;
        float alan = pi*r*r;
        float daire_dilim_alan = (pi*(r*r)*a)/360;

        System.out.println("Dairenin Çevresi : " + cevre );

        System.out.println("Dairenin Alanı : " + alan );

        System.out.println("Dairenin Dilim Alanı : " + daire_dilim_alan );





    }
}
