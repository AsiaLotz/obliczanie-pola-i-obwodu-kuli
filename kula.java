package com.company;
import java.util.Scanner;
public class kula {

    public static void main(String[] args) {
        final double CONSTANT_PI = 3.14159265359;

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj promień");
        String promien = scan.nextLine();

        double r=Double.valueOf(promien);
        System.out.println("Promień to   " + r);

        double ob= CONSTANT_PI * r;
        double po= CONSTANT_PI  * Math.pow(r,2);

        System.out.println("Obwód kuli to   " + ob);
        System.out.println("Pole kuli to   " + po);
    }
}
