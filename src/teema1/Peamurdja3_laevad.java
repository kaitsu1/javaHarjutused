package teema1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * NB! Lahenda käesolev ülesanne konsoolis. Pole vaja JavaFXi siia segada.
 *
 * 1. Kirjuta lihtne laevade pommitamise mäng, kus arvuti genereerib 1x1
 *    laevad mööda 1 dimensioonilist lauda. See tähendab, et mängulaud
 *    ei ole mitte ruudustik, vaid üks rida.
 *
 * 2. Täienda mängu nii, et nüüd oleks laual ruudustik.
 *
 * 3. Kas oskad ka nii, et laevad ei ole 1x1 vaid 1x2 ja 1x3 ja orienteeruvad
 *    nii vertikaalselt kui ka horisontaalselt?
 */
public class Peamurdja3_laevad {
    public static void main(String[] args) {

        /*
        int[]laud ={0, 1, 0, 0, 1, 1, 0, 0, 0};
        Scanner kasutaja = new Scanner (System.in);
        System.out.println("Sisesta number");
        int sisestus = kasutaja.nextInt();

        if (laud[sisestus]==0) {
            System.out.println("Mööda");
        } else if (laud[sisestus]==1) {
            System.out.println("Pihtas");
        }
        System.out.println(Arrays.toString(laud));
        */




        int[][] laud = new int[5][5];
        Scanner kasutaja= new Scanner ((System.in);
        System.out.println("Sisesta number");
        int sisestus = kasutaja.nextInt();

        int hit=laud[sisestus];
        if (hit == 0 ){
            System.out.println("Mööda");
        } else if (hit ==2) {
            System.out.println("Oled siia juba lasknud");
        } else if (hit == 1) {
            System.out.println("Pihtas");
            laud [sisestus] = 2;
        }
    }

}
sout
