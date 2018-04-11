
package punto4.dominio;

public class ArregloNumero {
    
    private int[] numeros;

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }
    
    public void mostrarElementosDelArreglo(){
        for(int i=0;i<numeros.length;i++){
            System.out.println("Valor de elemento: "+numeros[i]);
        }
    }
}
