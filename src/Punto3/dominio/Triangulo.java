/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3.dominio;

/**
 *
 * @author PC1
 */
public class Triangulo {
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
    public void comprobarTriangulo(){
        if((lado1+lado2>lado3)&&(lado1+lado3>lado2)&&(lado2+lado3>lado1)){
            double per=lado1+lado2+lado3;
            System.out.println("Perimetro es: "+per);
        }else{
            System.out.println("no se ha formado el triangulo");
        }
    }
    
    public double obtenerPerimetro(){
        return lado1+lado2+lado3;
    }
    public void mostrarTriangulo(){
        System.out.println("==============================================================================");             
        System.out.println("LADO1: "+getLado1()+"  LADO2: "+getLado2()+"  LADO3: "+getLado3());
        System.out.println("PERIMETRO DE TRIANGULO: "+obtenerPerimetro());
    }
    
}
