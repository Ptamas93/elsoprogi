package hu.progmatic;

import java.util.Scanner;

public class Taskeasy_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adj meg egy számot!");
        int a = sc.nextInt();
        sc.nextLine();

        System.out.println("Adj meg még egy számot!");
        int b = sc.nextInt();
        sc.nextLine();

        if (b == 0) {
            System.out.println("Nullával nem osztunk!!!!!!!!!!!!!!!");
        } else {
            System.out.println("Eredmény: " + (double)a / b);
        }
    }
}
