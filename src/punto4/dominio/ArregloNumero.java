
package punto4.dominio;

public class ArregloNumero {
    
    private int[] numeros=new int [10];

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
    
    public int obtenerMayor(){
        int mayor=numeros[0];
        for(int i=0;i<numeros.length;i++){
            if(numeros[i]>mayor){
                mayor=numeros[i];
            }
        }
        return mayor;
    }
    
    public int obtenerMenor(){
        int menor=numeros[0];
        for(int i=0;i<numeros.length;i++){
            if(numeros[i]<menor){
                menor=numeros[i];
            }
        }
        return menor;
    }
    
    public double obtenerPromedio(){
        int suma=0;
        for(int i=0;i<numeros.length;i++){
            suma=suma+numeros[i];
        }
        return suma/10;
    }
}
