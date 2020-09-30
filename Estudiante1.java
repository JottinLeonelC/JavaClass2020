package Leonel.Jottin;

public class Main {

    public static void main(String[] args) {
	// Este programa accede a estudiante promedio

        Estudiante jottin = new Estudiante();

        jottin.setpromedio(91.0);
        System.out.println("El promedio es: "+ jottin.setPromedio() );

    }
}