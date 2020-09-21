package Leonel.Jottin;

import javax.swing.*;

public class Meses {
      //Este programa cambia el mes de numerico a su nombre.

    public static void main(String[] args){
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un mes del año en numeros"));
        if(n1 == 1){
            System.out.println("El mes ingresado es Enero");
        }else if(n1 == 2){
            System.out.println("El mes ingresado es Febrero");
        }else if(n1 == 3){
            System.out.println("El mes ingresado es Marzo");
        }else if(n1 == 4){
            System.out.println("El mes ingresado es Abril");
        }else if(n1 == 5){
            System.out.println("El mes ingresado es Mayo");
        }else if(n1 == 6){
            System.out.println("El mes ingresado es Junio");
        }else if(n1 == 7){
            System.out.println("El mes ingresado es Julio");
        }else if(n1 == 8){
            System.out.println("El mes ingresado es Agosto");
        }else if(n1 == 9){
            System.out.println("El mes ingresado es Septiembre");
        }else if(n1 == 10){
            System.out.println("El mes ingresado es Octubre");
        }else if(n1 == 11){
            System.out.println("El mes ingresado es Noviembre");
        }else if(n1 == 12){
            System.out.println("El mes ingresado es Diciembre");
        }else{System.out.println("El mes ingresado no es valido");}

    }
}