package Leonel.Jottin;

import java.util.Scanner;

public class Imprime {
    Scanner teclado = new Scanner(System.in);
    int inicio;
    int fin;

    public void Entrada() {
        System.out.println("Este programa imprime en pantalla los numeros enteros en un limite dado");
        System.out.println("Ingrese el numero inicial:");
        //Scanner inicial = new Scanner(System.in);
        inicio = teclado.nextInt();
        }
    public void proceso() {
        System.out.println("Ingrese el numero final:");
        fin = teclado.nextInt();
        for (int x = inicio; x <= fin; x++)
            System.out.println(x);
    }
    public static void main(String[] args) {
        Imprime limites = new Imprime();
        limites.Entrada();
        limites.proceso();
    }
}