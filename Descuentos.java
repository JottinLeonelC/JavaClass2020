package Leonel.Jottin;

import java.util.Scanner;

public class Descuentos {


    public static void main(String[] args) {
        System.out.println("Introducir el salario mensual devengado: ");
       dgii();
    }

    public static void dgii() {
        double salario;
        Scanner sc = new Scanner(System.in);
        salario = sc.nextDouble();
        if (salario <= 34685) {
            System.out.println("Este salario esta excento del ISR");
        } else if (salario > 416220.01 / 12 && salario <= 624329 / 12) {
            double incremento = salario - 416220.01 / 12;
            double ISR = incremento * 0.15;
            System.out.println("ISR a descontar es: " + ISR);
        } else if (salario > 624329.01 / 12 && salario <= 867123.00 / 12) {
            double incremento = salario - 624329.01 / 12;
            double ISR = incremento * 0.20 + 31216.00 / 12;
            System.out.println("ISR a descontar es: " + ISR);
        } else if (salario > 867123.01 / 12) {
            double incremento = salario - 867123.01 / 12;
            double ISR = incremento * 0.25 + 79776.00 / 12;
            System.out.println("ISR a descontar es: " + ISR);
        }
        System.out.println("ARS a descontar es: " + salario*0.0304);
        System.out.println("AFP a descontar es: " + salario*0.0287);
    }
}