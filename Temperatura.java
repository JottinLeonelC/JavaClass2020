package Leonel.Jottin;

import java.util.Scanner;

public class Temperatura {
    public void convertirCaF(){
        //Este programa convierte temperatura de C a F
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la temperatura en grados Cersius");
        double n1 =sc.nextDouble();
        double F;
        F = n1*9/5 +32;
        System.out.println("La temperatura en F es:  "+ F);

    }
}
