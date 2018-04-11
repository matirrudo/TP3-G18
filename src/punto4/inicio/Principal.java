
package punto4.inicio;

import java.util.Scanner;
import punto4.dominio.ArregloNumero;


public class Principal {

    public static void main(String[] args) {
        System.out.println("Ingrese 10 numeros: ");
        Scanner objScanner= new Scanner(System.in);
        
        int [] numero=new int[10];
        
        for (int i=0;i<numero.length;i++){
            System.out.print("Numero "+(i+1)+ ": ");
            numero[i]=objScanner.nextInt();
        }
        
        for (int i=0;i<numero.length;i++)
            System.out.println(numero[i]);   
        
        int suma=0;
        for (int i=0;i<numero.length;i++)
            suma=suma+numero[i];
        System.out.println("Promedio: "+suma/numero.length);
        
        ArregloNumero objArreglo=new ArregloNumero();
        int contador=0;
        while(contador<10){
            System.out.print("Ingrese Numero: ");
            objArreglo.getNumeros()[contador] =objScanner.nextInt();
            contador++;
          
        }
        objArreglo.mostrarElementosDelArreglo();
        
        
        
    }
    
}
