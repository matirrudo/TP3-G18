
package punto11.inicio;

import java.util.ArrayList;
import java.util.Scanner;
import punto11.dominio.Zapatilla;

public class Principal {

    public static void main(String[] args) {
        Scanner objScanner=new Scanner(System.in);
        String marca=new String();
        String letraIngresada=new String();
        boolean original=false;
        boolean continuar=true;
        
        ArrayList<Zapatilla> listaZapatillas=new ArrayList<Zapatilla>();
        while(continuar==true){
            
        
        System.out.println("Registrar Zapatillas");
        System.out.println("Ingrese Marca: ");
        marca=objScanner.nextLine();
        
        System.out.println("¿Es original?  S/N");
        letraIngresada= (objScanner.nextLine().toLowerCase());
        if ("s".equals(letraIngresada))
            original=true;
        else
            original=false;
                            
        
        
        listaZapatillas.add(new Zapatilla(marca,original));
        
            System.out.println("Desea seguir registrando zapatillas:  S/N");
            letraIngresada=objScanner.nextLine().toLowerCase();
            if ("s".equals(letraIngresada))
                continuar=true;
            else
                continuar=false;
            
        }
        
        
        for (Zapatilla e:listaZapatillas){
            
            System.out.print("Marca: "+e.getMarca()+"  ");
           
            if (e.getOriginal()==true)
                System.out.println("Es Original");
            else
                System.out.println("No es Original");
        }
        
         }
    
}
