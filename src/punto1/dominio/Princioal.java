
package punto1.dominio;

import java.util.Scanner;

/**
 *
 * @author grupo18
 */
public class Princioal {

   
    public static void main(String[] args) {
        Punto objecto1=new Punto();//definicion de constructores
        Punto objecto2 = new Punto();
        Scanner sc=new Scanner(System.in);
        System.out.println("objecto 1");
        System.out.println("ingrese x: ");
        objecto1.setX(sc.nextInt());
        System.out.println("ingrese y: ");
        objecto1.setY(sc.nextInt());
        System.out.println("objecto 2");
        System.out.println("ingrese x: ");
        objecto2.setX(sc.nextInt());
        System.out.println("ingrese y: ");
        objecto2.setY(sc.nextInt());
        System.out.println("Distancia entre los objectos: "+objecto1.calcularDistanciaEntrePuntos(objecto2));
    }
    
}
