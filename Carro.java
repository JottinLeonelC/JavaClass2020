package Leonel.Jottin;

public class Carro {
    int cantidadCombustible;

    public void encender (int cantidadCombustible){
        while(cantidadCombustible!=0){
            if(cantidadCombustible > 0){
                System.out.println("El auto avanza");
                cantidadCombustible--;
                System.out.println("Su cantidad de combustible disponible es: "+cantidadCombustible);
            }
        }System.out.println ("El carro no puede avanzar");
    }
}
