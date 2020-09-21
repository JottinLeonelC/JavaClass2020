package Leonel.Jottin;

import java.util.Scanner;

public class Cajero {
    static int b1000 = 9;
    static int b500 = 19;
    static int b100 = 99;

    public static void main(String[] args) {
    int banco = 0;
    int limiteABC = 10000;
    int limiteOtros = 2000;
    Scanner sc = new Scanner(System.in);
    while (banco != 3) {
        System.out.println("Bienvenido al Cajero Automatico");
        System.out.println("Por favor, seleccione su banco: ");
        System.out.println("1- Banco ABC");
        System.out.println("2- Otro Banco");
        System.out.println("3- Salir");
        banco = sc.nextInt();

        if (banco == 1) {
            System.out.println("Bienvenido al Banco ABC, ingrese el monto a retirar");
            int monto = sc.nextInt();
            if (monto <= limiteABC) {
                dispensarBilletes(monto);
            } else {
                System.out.println("Este monto excede su limite diario");
            }
        }
        if (banco == 2) {
            System.out.println("Bienvenido a Otro Banco, ingrese el monto a retirar");
            int monto = sc.nextInt();
            if (monto <= limiteOtros) {
                dispensarBilletes(monto);
            } else {
                System.out.println("Este monto excede su limite diario");
            }
        }
    }

}

     public static void dispensarBilletes(int monto){
        int de1000 = monto/1000;
        if (de1000 > b1000){
            de1000 = b1000;
        }
        monto -= de1000*1000;
        int de500 = monto/500;
         if (de500 > b500){
             de500 = b500;
         }
        monto -= de500*500;
        int de100 = monto/100;
         if (de100 > b100){
             System.out.println("Este cajero no dispone el monto solicitado");
         }
        monto -= de100*100;
        System.out.printf("Billetes dispensados: %d de mil, %d de 500 y %d de 100",de1000,de500,de100);
         System.out.println();
        b1000 -= de1000;
        b500 -= de500;
        b100 -= de100;
        return;
}
}