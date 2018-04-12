
package Punto3.dominio;

import java.util.Scanner;

/**
 *
 * @author grupo18
 */
public class Principal {

    public static void main(String[] args) {
         Triangulo unTriangulo=new Triangulo();
        Scanner sc= new Scanner(System.in);
        System.out.println("ingrese lado a: ");
        unTriangulo.setLado1(sc.nextDouble());
        System.out.println("ingrese lado b: ");
        unTriangulo.setLado2(sc.nextDouble());
        System.out.println("ingrese lado c: ");
        unTriangulo.setLado3(sc.nextDouble());
        unTriangulo.comprobarTriangulo();
    }
    
}
