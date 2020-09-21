package Leonel.Jottin;

import java.util.Scanner;

public class Usuario extends Apoyo1{
    private static String clave;
    private static String usuario;

    public static void main(String[] args){
       Apoyo1 p1= new Apoyo1();
       String usuario1 = "Admin";
       String clave1 = "1234";
     do {
         System.out.println("Ingrese su nombre de usuario: ");
         Scanner sc = new Scanner(System.in);
         usuario = sc.next();
         System.out.println("Ingrese su contraseña: ");
         Scanner sc2 = new Scanner(System.in);
         clave = sc2.next();
         if (usuario.equals(usuario1) && clave.equals(clave1)) {
             System.out.println("Acceso correcto!!");
             System.out.println("Bienvenido!!");
             p1.veces = 3;
         } else {
             System.out.println("Usuario o clave incorrecta");
             p1.veces++;
             if(p1.veces == 3){
                 System.out.println("Acceso restringuido!!");}
             }

     }while (p1.veces < 3);
       }
   }