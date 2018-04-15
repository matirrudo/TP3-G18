
package punto3.inicio;

import java.util.Scanner;
import punto3.dominio.Triángulo;



/**
 *
 * @author josericardo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               Scanner entrada = new Scanner(System.in);
               Triángulo triangulo = new Triángulo();
               
               System.out.println("INGRESE LADO A: ");
               triangulo.setLado1(entrada.nextDouble());
               double lado1=triangulo.getLado1();
          
               System.out.println("INGRESE LADO B: ");
               triangulo.setLado2(entrada.nextDouble());
               double lado2=triangulo.getLado2();
               
               System.out.println("INGRESE LADO C: ");
               triangulo.setLado3(entrada.nextDouble());
               double lado3=triangulo.getLado3();
        
                 
                 System.out.println("==============================================================================");             
                 System.out.println("LADO1: "+lado1+"  LADO2: "+lado2+"  LADO3: "+lado3);
                 
           
                 
                 
                 if (triangulo.verificarSiEsUnTriangulo(lado1, lado2, lado3) == true){
                       System.out.println("LOS VALORES INGRESADOS FORMAN UN TRIANGULO !!!");// SI ES TRIANGUULO SE MOSTRARA ESTE MENSAJE Y SU PERIMETRO
                        System.out.println("SU PERIMETRO ES: "+triangulo.obtenerPerimetro());
                  }else{
                       System.out.println("LOS VALORES INGRESADOS NO FORMAN UN TRIANGULO !!!"); // SI NO FORMA UN TRIANGULO SE MOSTRARA ESTE MENSAJE
                   
        }
            System.out.println("====================================================================================");

    }
    
}
