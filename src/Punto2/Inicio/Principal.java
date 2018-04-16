
package Punto2.Inicio;

import Punto2.Dominio.Punto;
import Punto2.Dominio.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author patagua ivan
 */
public class Principal {

    public static void main(String[] args) {
        Punto unPunto=new Punto();
        Rectangulo unRectangulo=new Rectangulo();
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Ingresar Punto: ");
        System.out.println("Ingrese x: ");
        int x=sc.nextInt();
        unPunto.setX(x);
        System.out.println("Ingrese y: ");
        int y=sc.nextInt();
        unPunto.setY(y);
        System.out.println("Rectangulo");
        System.out.println("Ingrese base: ");
        double base=sc.nextDouble();
        unRectangulo.setBase(base);
        System.out.println("Ingrese altura: ");
        double altura=sc.nextDouble();
        unRectangulo.setAltura(altura);
        unRectangulo.mostrarRectangulo();
        Punto segundoPunto=new Punto();
        segundoPunto.setX((int) (y+base));
        segundoPunto.setY((int) (x+altura));
        Punto tercerPunto=new Punto();
        tercerPunto.setX((int) (y+altura));
        tercerPunto.setY(x);
        Punto cuartoPunto=new Punto();
        cuartoPunto.setX((int) (x+base));
        cuartoPunto.setY(y);
        System.out.println("Posicion de los puntos faltantes: ");
        unPunto.mostrarPunto();
        segundoPunto.mostrarPunto();
        tercerPunto.mostrarPunto();
        cuartoPunto.mostrarPunto();
}
}    
