package Leonel.Jottin;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        //Menu de programas enlazados.
       // Scanner sc = new Scanner(System.in);

        Temperatura TF = new Temperatura();
        Dolar DP = new Dolar();
        Metros MP = new Metros();
        //System.out.println("Indique su opcion deseada");
        int opcion = 0;
        while (opcion != 4) {
            menu();
            System.out.println("Indique su opcion deseada");
            Scanner sc = new Scanner(System.in);
            opcion = sc.nextInt();
            if (opcion == 1) {
                TF.convertirCaF();
            } else if (opcion == 2) {
                DP.Dp();
            } else if (opcion == 3) {
                MP.Metro();
            }
                    }
        }

    public static void menu() {
        System.out.println("Menu");
        System.out.println("1- Convertir temperatura de grados Cersius a grados Fahrenheit");
        System.out.println("2- Convertir de Dolares a Pesos");
        System.out.println("3- Convertir Metros a Pies");
        System.out.println("4- Para Salir");
    }
}