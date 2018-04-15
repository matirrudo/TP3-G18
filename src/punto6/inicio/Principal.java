package punto6.inicio;

import java.util.Scanner;
import punto6.dominio.GestorRectangulos;
import punto6.dominio.Rectangulo;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangulo rec1=new Rectangulo("rectangulo1",1, 2, 2, 4);
        Rectangulo rec2=new Rectangulo("rectangulo2",5, 5, 3, 6);
        Rectangulo rec3=new Rectangulo("rectangulo3",10, 10, 4, 8);
        
        GestorRectangulos gestor =new GestorRectangulos(rec1);
        
        gestor.agregarRectangulo(rec1);
        gestor.agregarRectangulo(rec2);
        gestor.agregarRectangulo(rec3);
        
        for (Rectangulo asd: gestor.getListaRectangulos()) {
            System.out.println("NOMBRE: "+asd.getNombre());
            System.out.println("punto: ("+asd.getX()+", "+asd.getY()+")");
            System.out.println("base: "+asd.getBase()+", altura: "+asd.getAltura());
            System.out.println("perimetro: "+asd.getPer()+", superficie: "+asd.getSup());
            System.out.println("-----------------");    
            
        }
        boolean band=true;
        int rectangulo;
        while (band==true) {            
            System.out.println("Que rectangulo quiere eliminar? (1, 2 o 3): ");
            System.out.println("Para terminar ingrese 0: ");
            rectangulo=sc.nextInt();
            if (rectangulo==1||rectangulo==2||rectangulo==3) {
                gestor.eliminarRectangulo(rectangulo-1);   
                System.out.println("SE A ELIMINADO EL RECTANGULO "+(rectangulo+1));
            }else{
                band=false;
            }
            for (Rectangulo asd: gestor.getListaRectangulos()) {
            System.out.println("NOMBRE: "+asd.getNombre());
            System.out.println("punto x: "+asd.getX()+", punto y: "+asd.getY());
            System.out.println("base: "+asd.getBase()+", altura: "+asd.getAltura());
            System.out.println("perimetro: "+asd.getPer()+", superficie: "+asd.getSup());
            System.out.println("-----------------");    
            
        }
        }
    }
    
}
