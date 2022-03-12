package hu.progmatic;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérek egy számot.");
        int szam = sc.nextInt();
        String osztok = "";
        int osztokSzama = 0;

        if ( 0 > szam ) {
            System.out.println("Nem természetes számot adtál meg.");
        } else if (szam > 1) {
            for (int i = 1; i < szam; i++) {
                if (szam % i == 0) {
                    osztokSzama++;
                    osztok += (i + ", ");
                }

            }
            osztokSzama++;
            osztok += szam;
            System.out.println("Osztók száma: " + osztokSzama + " (Mert az osztók: " + osztok + ")");
        } else {
            System.out.println("Osztók száma: 1");
        }

    }
}
