package punto6.inicio;

import punto6.dominio.GestorRectangulos;
import punto6.dominio.Rectangulo;

public class Principal {

    public static void main(String[] args) {
        Rectangulo rec1=new Rectangulo("rectangulo1",1, 2, 2, 4);
        Rectangulo rec2=new Rectangulo("rectangulo2",5, 5, 2, 4);
        Rectangulo rec3=new Rectangulo("rectangulo2",10, 10, 2, 4);
        
        GestorRectangulos gestor =new GestorRectangulos(rec1);
        gestor.agregarRectangulo(rec1);
        gestor.agregarRectangulo(rec2);
        gestor.agregarRectangulo(rec3);
        for (Rectangulo asd: gestor.getListaRectangulos()) {
            System.out.println("nombre: "+asd.getNombre());
            System.out.println("punto x: "+asd.getX());
            System.out.println("punto y: "+asd.getY());
            System.out.println("base: "+asd.getBase());
            System.out.println("altura: "+asd.getAltura());
            System.out.println("----------");    
        }
    }
    
}
