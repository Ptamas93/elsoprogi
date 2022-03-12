package hu.progmatic;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Kérek egy számot.");
        int szam = sc.nextInt();

        boolean primszamE = true;

        if ( 2 > szam  ) {
            System.out.println("Nem prímszám.");
        } else {
            for (int i = 2; i < szam; i++) {
                if (szam % i == 0) {
                    primszamE = false;
                    break;
                }

            }
            System.out.println(primszamE);
        }
    }
}
