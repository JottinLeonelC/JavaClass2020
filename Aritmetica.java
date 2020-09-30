package Leonel.Jottin;

public class Aritmetica {
    public double n1;
    public double n2;

    public void sumar(double n1, double n2){
        double suma = n1 + n2;
        System.out.println("La suma es: "+suma);
    }
    public void restar(double n1, double n2){
        double resta = n1 - n2;
        System.out.println("La resta es: "+resta);
    }
    public void dividir(double n1, double n2){
        double dividir = n1 / n2;
        System.out.println("La division es: "+dividir);
    }
    public void multiplicar(double n1, double n2){
        double multiplicar = n1 * n2;
        System.out.println("La multiplicacion es: "+multiplicar);
    }
}
