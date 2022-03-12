package hu.progmatic;

import java.util.Scanner;

public class Legnagyobbkozos {
    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        int elsoSzam, masodikSzam;
        do {
            System.out.print("Kérjük adja meg az 1. számot (nagyobb 0-nál): \n");
            String elso = in.nextLine();
            elsoSzam = Integer.parseInt(elso);
            System.out.print("Kérjük adja meg a 2. számot (nagyobb 0-nál): \n");
            String masodik = in.nextLine();
            masodikSzam = Integer.parseInt(masodik);
        } while (elsoSzam <= 0 || masodikSzam <= 0);
        int szorzat = elsoSzam * masodikSzam;
        int maradek = elsoSzam % masodikSzam;
        while (maradek != 0) {
            elsoSzam = masodikSzam;
            masodikSzam = maradek;
            maradek = elsoSzam % masodikSzam;
        }
        System.out.println("A legnagyobb közös osztó: " + masodikSzam);
    }
}*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Add meg a első számot!");
        int a = sc.nextInt();
        sc.nextLine();

        System.out.println("Add meg a második számot!");
        int b = sc.nextInt();
        sc.nextLine();

        int maxOszto = 0;

        if (a < b) {
            int ideiglenes = a;
            a = b;
            b = ideiglenes;
        }
        for (int i = 1; i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                maxOszto = i;
            }
        }
        System.out.println("A legnagyobb közös osztó: " + maxOszto);
    }
}

