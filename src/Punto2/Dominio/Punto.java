/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2.Dominio;

/**
 *
 * @author PC1
 */
public class Punto {
    private int x;
    private int y;

    public Punto() {
        
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    public Punto(int x, int y){
        this.x=x;
        this.y=y;
    }
    
     public void mostrarPunto(){
        System.out.println("Punto x: "+getX());
        System.out.println("Punto y: "+getY());
    }
    public double calcularDistanciaEntrePuntos(punto1.dominio.Punto otroPunto){
        
        return Math.sqrt(Math.pow(otroPunto.getX()-x, 2)+Math.pow(otroPunto.getY()-y, 2));
    }
}
