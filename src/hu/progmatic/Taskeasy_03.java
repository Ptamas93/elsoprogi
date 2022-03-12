package hu.progmatic;

import java.util.Scanner;

public class Taskeasy_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérek egy egész számot.");
        int a = sc.nextInt();

        if (a > 0) {
            System.out.println("Pozitív.");
        } else if (a < 0) {
            System.out.println("Negatív.");
        } else {
            System.out.println("Nulla.");
        }
    }
}
