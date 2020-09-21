package Leonel.Jottin;

import javax.swing.JOptionPane;

public class Promedio {

    public static void main(String[] args){
        int numero;
        int elementos = 0;
        int suma = 0;
        float media = 0;
        System.out.println("Este programa determina el promedio de los numeros digitados (finaliza con 0 o menor");
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero:"));

        while (numero > 0){
            suma = suma + numero;
            elementos++;

            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el siguiente numero: (con Cero termina)"));
        }
        if(elementos == 0){
            System.out.println("No esta permitida la division entre cero");
        }else {
            media = (float) suma / elementos;
            System.out.println("El promedio es: " + media);
        }
    }
}