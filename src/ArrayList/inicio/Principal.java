
package ArrayList.inicio;

import java.util.ArrayList;
import java.util.Iterator;


public class Principal {

    public static void main(String[] args) {
        
        ArrayList<String> lista=new ArrayList<String>();
        if(lista.isEmpty()){
            System.out.println("La lista esta vacia ");
            lista.add("Lunes");
            lista.add("Martes");
            lista.add("Miercoles");
            lista.add("Jueves");
            lista.add("Viernes");
            lista.add("Sabado");
            lista.add("Domingo");
            
            //mostrarElementosDeLaLista(lista);
            //lista.remove(1);
            //lista.remove("Domingo");
            mostrarElementosDeLaLista(lista);
            System.out.println("El tamaño de la lista: "+lista.size());
            System.out.println("El objeto  en la posicion 4: "+lista.get(4));
            System.out.println("la posicion del objeto Martes es: "+lista.indexOf("Martes"));
            
    }else{
            System.out.println("La lista no esta vacia ");
        }
        
        
    }
    public static void  mostrarElementosDeLaLista(ArrayList<String> list){
        /*
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println("El objeto en lista es: "+(String)iterator.next());
*/
        for(String cadena:list){
            System.out.println("El Elemento de la lista es: "+cadena);
        
        }
    }
    
}
