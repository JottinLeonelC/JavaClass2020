package Leonel.Jottin;

import java.util.Scanner;

public class Dolar {

   public void Dp(){
            // Programa que convierte dolar a peso
       Scanner sc = new Scanner(System.in);
       System.out.println("Digite la cantidad de dolares a convertir a pesos");
       double dolares = sc.nextDouble();
            double tasa = 58.50;
            System.out.println("La cantidad de pesos a recibir es: ");
            System.out.println(dolares * tasa);
        }
    }