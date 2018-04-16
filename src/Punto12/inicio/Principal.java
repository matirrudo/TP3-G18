
package Punto12.inicio;

import Punto12.dominio.Libro;
import java.util.ArrayList;
import java.util.Scanner;


public class Principal {

    
    public static void main(String[] args) {
        
        
        Libro listaLibros[]=new Libro[10];
        listaLibros[0]=new Libro("Cien años de soledad","Gabriel Garcia Marquez","Novela Fantastica");
        listaLibros[1]=new Libro("Ficciones","Jorge Luis Borges","Cuentos");
        listaLibros[2]=new Libro("Viaje al centro de la tierra","Julio Verne","Ciencia Ficcion");
        listaLibros[3]=new Libro("Don Quijote de la Mancha","Miguel de Cervantes","Novela");
        listaLibros[4]=new Libro("Las venas abiertas de America Latina","Eduardo Galeano","Ensayo");
        listaLibros[5]=new Libro("Juego de Tronos","R.R. Martin","Fantasia");
        listaLibros[6]=new Libro("El diario de Ana Frank","Ana Frank","Novela Historica");
        listaLibros[7]=new Libro("Watchmen","Alan Moore","Novela Grafica");
        listaLibros[8]=new Libro("El Guardian entre el Centeno","Jerome David Salinger","Novela Dramatica");
        listaLibros[9]=new Libro("1984","George Orwell","Ciencia Ficcion");
        
        for (int i=0;i<listaLibros.length;i++ ){
            System.out.println("Lista de todos los Libros:");
            System.out.println((i+1)+"- "+listaLibros[i].getTitulo()+" - "+listaLibros[i].getAutor()+" - "+listaLibros[i].getCategoria());
        }
        
        String autor= new String();
        String categoria= new String();
        String titulo= new String();
        int opcionIngresada;
        Scanner objScanner= new Scanner(System.in);
        System.out.println("Busqueda de libros ");
        System.out.println("Ingrese la opcion de como quiere realizar la busqueda: ");
        System.out.println("1- Busqueda por Titulo.");
        System.out.println("2- Busqueda por Categoria.");
        System.out.println("3- Busqueda por Titulo Y Categoria.");
        opcionIngresada=objScanner.nextInt();
        if (opcionIngresada==1){
            System.out.println("Ingrese el titulo del libro: ");
            titulo=objScanner.nextLine();
            for(int i=0;i<listaLibros.length;i++){
                if(listaLibros[i].getTitulo().equals(titulo)){
                    System.out.println(listaLibros[i].getTitulo()+" - "+listaLibros[i].getAutor()+" - "+listaLibros[i].getCategoria());
                    
                }
            }
        }
            if(opcionIngresada==2){
                System.out.println("Elija la categoria que desea obtener: ");
                for (int i=0; i<listaLibros.length;i++){
                    System.out.println((i+1)+"- "+listaLibros[i].getCategoria());
                }
                opcionIngresada=objScanner.nextInt();
                categoria=listaLibros[opcionIngresada-1].getCategoria();
                for(int i=0;i<listaLibros.length;i++){
                    if (listaLibros[i].getCategoria().equals(categoria)){
                        System.out.println(listaLibros[i].getCategoria()+" - "+listaLibros[i].getTitulo()+" - "+listaLibros[i].getAutor());
                    }
                }
                    }
                 
        
    }
        
        
        
        
}
    

