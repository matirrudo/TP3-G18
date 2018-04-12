
import java.util.Scanner;
import punto3.dominio.Triangulo;




public class Principal {

    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    Triangulo triangulo = new Triangulo();
               
               System.out.println("INGRESE LADO A: ");
               double a = entrada.nextDouble();
        
               System.out.println("INGRESE LADO B: ");
               double b = entrada.nextDouble();
        
               System.out.println("INGRESE LADO C: ");
               double c = entrada.nextDouble();
        
        
                   if (triangulo.verificarSiEsUnTriangulo(a, b, c) == true){
                       System.out.println("LOS VALORES INGRESADOS FORMAN UN TRIANGULO !!!");// SI ES TRIANGUULO SE MOSTRARA ESTE MENSAJE
        
                  }else{
                       System.out.println("LOS VALORES INGRESADOS NO FORMAN UN TRIANGULO !!!"); // SI NO FORMA UN TRIANGULO SE MOSTRARA ESTE MENSAJE
        }
        
    }
    
}
