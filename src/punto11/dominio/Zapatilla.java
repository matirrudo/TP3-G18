
package punto11.dominio;

public class Zapatilla {
    
    private String marca;
    private boolean original;
    
    public Zapatilla(String marca,boolean original){
        this.marca=marca;
        this.original=original;
        
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean getOriginal(){
        return original;
    }

    public void setOriginal(boolean original) {
        this.original = original;
    }
    
    
    
}