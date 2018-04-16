
package Punto8.Inicio;

import Punto8.Dominio.ArraylistdeLibros;
import Punto8.Dominio.Libro;
import java.util.Scanner;

/**
 *
 * @author Patagua Ivan
 */
public class Principal {
    
    public static void main(String[] args) {
        ArraylistdeLibros listadeLibros=new ArraylistdeLibros();
        Scanner sc=new Scanner(System.in);
        boolean continuar=true;
        
        
        while(continuar==true){
        
            System.out.println("REGISTRO DE LIBROS");
            System.out.println("Ingrese ISBN del Libro: ");
            String isbn=sc.nextLine();
            System.out.println("Ingrese Titulo del Libro: ");
            String titulo=sc.nextLine();
            System.out.println("Ingrese Autor de Libro: ");
            String autor=sc.nextLine();
            System.out.println("Ingrese Precio del Libro: ");
            String precio=sc.nextLine();
            Libro unLibro=new Libro(isbn, titulo, autor, precio);
            listadeLibros.getListadeLibros().add(unLibro);
            listadeLibros.mostrarArrayListdeLibros();
            
            System.out.println("Desea agregar mas libros (S/N)? ");
            String r=sc.nextLine().toLowerCase();
            if (r.equals("s")==true || r.equals("S")==true){
                continuar=true;
            }else{
                continuar=false;
                System.out.println("FIN");
            }
       }
     
    }
        
        
    }
    

