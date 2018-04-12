package punto5.inicio;

import punto5.dominio.Circulo;
import punto5.dominio.GestorCirculos;

public class Principal {


    public static void main(String[] args) {
        
        Circulo circulo1 =new Circulo(2);
        Circulo circulo2 =new Circulo(3);
        Circulo circulo3 =new Circulo(4);
        
        GestorCirculos gestor= new GestorCirculos();
        gestor.agregarCirculo(circulo1);
        gestor.agregarCirculo(circulo2);
        gestor.agregarCirculo(circulo3);
        
        for (Circulo asd : gestor.getListaCirculos()) {
            System.out.println(asd.getRadio());
            System.out.println(asd.calcularArea());
        }
                
    }
    
    
    
}
