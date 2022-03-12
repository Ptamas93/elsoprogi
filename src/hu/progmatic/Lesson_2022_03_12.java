package hu.progmatic;

import java.util.Scanner;

public class Lesson_2022_03_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem az évszámot.");
        int evszam = sc.nextInt();
        sc.nextLine();
        boolean szokoevE = false;

        if (1582 <= evszam) {
            if (evszam %400 == 0) {
                szokoevE = true;
            } else if (evszam %4 == 0 && evszam %100 != 0) {
                szokoevE = true;
            }
        }

        System.out.println("Ez az év " + (szokoevE ? "" : "nem ") + "szökőév.");
    }
}
