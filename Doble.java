package Leonel.Jottin;

public class Doble extends Apoyo1{
    //Este programa duplica un numero entero dado por el usuario.
    public static void main(String[] args) {
       Apoyo1 a1 = new Apoyo1();
       int numero1;
       int doble;
        System.out.println("Ingrese un numero entero para duplicarlo: ");
        a1.pedidoEntrada();
        numero1 = a1.numero;
        doble = 2*numero1;
        System.out.println("el doble de : "+numero1+ " es igual a: "+doble);
    }
}