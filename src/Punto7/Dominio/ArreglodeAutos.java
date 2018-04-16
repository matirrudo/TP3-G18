
package Punto7.Dominio;

/**
 *
 * @author Patagua Ivan
 */
public class ArreglodeAutos {
     private Auto [] arreglo;

    public ArreglodeAutos() {
        arreglo=new Auto[3];
    }

    public void mostrarArreglo(){
        for(int i=0;i<arreglo.length;i++){
            if(arreglo[i] != null){
                Auto a=arreglo[i];
                System.out.println("TABLA DE AUTOS");
                System.out.println("Auto en la posicion: "+i);
                System.out.println("Patente: "+a.getPatente());
                System.out.println("Marca: "+a.getMarca());
                System.out.println("Modelo: "+a.getModelo());
                System.out.println("Color: "+a.getColor());
                System.out.println("Tipo de Combustible: "+a.getTipoCombustible());
            }else{
                System.out.println("no existe elemento");
            }
        }
    }
    
    
    public Auto[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(Auto[] arreglo) {
        this.arreglo = arreglo;
    }
    
}
