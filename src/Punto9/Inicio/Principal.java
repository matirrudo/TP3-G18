
package Punto9.Inicio;

import Punto9.Dominio.ArrayListdeLibros;
import Punto9.Dominio.Libro;
import java.util.Scanner;

/**
 *
 * @author Patagua Ivan
 */
public class Principal {
    public static void main(String[] args) {
       ArrayListdeLibros listadeLibros=new ArrayListdeLibros();
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
                System.out.println("Desea buscar un libro en especial (S/N)?");
                String r2=sc.nextLine().toLowerCase();
                if((r2.equals("s")==true || r2.equals("S")==true)){
                    System.out.println("Ingrese titulo de libro: ");
                    String buscarTitulo=sc.nextLine();
                    listadeLibros.buscarLibro(buscarTitulo);
                        
                    }else{
                    System.out.println("***FIN***");
                }
                    
                }
            }
    }
    
}
