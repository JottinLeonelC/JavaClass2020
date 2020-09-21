package Leonel.Jottin;

import java.util.Scanner;

public class Metros {
    public void Metro(){
            //Conversor de Metros a Pies
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de metros a convertir a pies");
        double metros = sc.nextDouble();
            double pies;
            pies = metros*3.28;
            System.out.println(metros +" m convertidos a pies es igual a: "+pies+" pies");
        }
    }