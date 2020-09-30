package Leonel.Jottin;

public class Estudiante {
    //campo
    private double promedio;

    public void setpromedio(double promedio) {
      if(promedio > 0 && promedio <=100){
            this.promedio = promedio;
        }else System.out.println("El valor introducido no es valido");
       }
    public double setPromedio(){
        return promedio;
    }
  }