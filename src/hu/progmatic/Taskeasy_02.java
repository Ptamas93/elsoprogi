package hu.progmatic;

import java.util.Scanner;

public class Taskeasy_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adj meg egy számot!");
        int a = sc.nextInt();

        if (a > 0) {
            a--;
        }
        System.out.println("A szám értéke: " + a);
    }
}
