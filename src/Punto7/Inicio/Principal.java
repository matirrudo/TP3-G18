
package Punto7.Inicio;

import Punto7.Dominio.ArreglodeAutos;
import Punto7.Dominio.Auto;
import java.util.Scanner;

/**
 *
 * @author Patagua Ivan
 */
public class Principal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        Auto unAuto=new Auto();
        unAuto.setPatente("ABC 212");
        unAuto.setColor("azul");
        unAuto.setMarca("Ford");
        unAuto.setTipoCombustible("diesel");
        unAuto.setModelo("Focus");
        
        Auto segundoAuto=new Auto();
        segundoAuto.setPatente("AVL 314");
        segundoAuto.setColor("negro");
        segundoAuto.setMarca("Ford");
        segundoAuto.setTipoCombustible("diesel");
        segundoAuto.setModelo("Nuevo Fiesta");
        
        Auto tercerAuto=new Auto();
        tercerAuto.setPatente("BDE 432");
        tercerAuto.setColor("blanco");
        tercerAuto.setMarca("Ford");
        tercerAuto.setTipoCombustible("diesel");
        tercerAuto.setModelo("K4");
        
        ArreglodeAutos listaAutos=new ArreglodeAutos();
        listaAutos.getArreglo()[0]=unAuto;
        listaAutos.getArreglo()[1]=segundoAuto;
        listaAutos.getArreglo()[2]=tercerAuto;
        listaAutos.mostrarArreglo();
      
        System.out.println("*********************************************");
        
        System.out.println("DESEA MODIFICAR LOS DATOS DE UN AUTO (S/N)?");
        String res=sc.nextLine();
        if(res.equals("S")==true || res.equals("s")==true){
            System.out.println("Ingrese posicion de auto a modificar: ");
            int pos=sc.nextInt();
            if(pos==0 || pos==1 || pos==2){
                Auto automodificado =new Auto();
                System.out.println("Ingrese Patente: ");
                automodificado.setPatente(sc.nextLine());
                System.out.println("Ingrese Marca: ");
                automodificado.setMarca(sc.nextLine());
                System.out.println("Ingrese Modelo: ");
                automodificado.setModelo(sc.nextLine());
                System.out.println("Ingrese Color: ");
                automodificado.setColor(sc.nextLine());
                System.out.println("Ingrese Tipo de Combustible: ");
                automodificado.setTipoCombustible(sc.nextLine());
                listaAutos.getArreglo()[pos]=automodificado;
                System.out.println("*******************************************");
                listaAutos.mostrarArreglo();
            }else{
                System.out.println("No existe la posicion del auto");
            }
        }else{
            System.out.println("Fin");
        }
        
        
        
    }
    }
    

