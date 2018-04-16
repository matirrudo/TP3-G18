/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3.dominio;

/**
 *
 * @author mi pc
 */
public class Triángulo {
     
    private double lado1;
    private double lado2;
    private double lado3;

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
}
    
    
     //METODO PARA SABER SI CON LOS TRES VALORES SE FORMA UN TRIANGULO
    public boolean verificarSiEsUnTriangulo(double lado1, double lado2, double lado3){ // DEVUELVE VERDADERO SI ES UN TRIANGULO
    boolean band = false;
    
    if (lado1+lado2 > lado3 && lado1+lado3 > lado2 && lado2+lado3 > lado1){//FORMULA PARA SABER SI FORMA UN TRIANGULO
    
    band = true;
    }
   return band;
   }  
    
    
    
    // METODO PARA OBTENER EL PERIMEYRO DEL TRIANGULO
    public double obtenerPerimetro(){
    
       double peri=lado1+lado2+lado3;
    
       return peri;
    }

    
}
