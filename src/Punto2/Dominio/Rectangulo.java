
package Punto2.Dominio;

/**
 *
 * @author patagua ivan
 */
public class Rectangulo {
  private double base;
  private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double obtenerPerimetro(){
      return 2*altura+2*base;

    }
    
    public double obtenerSuperficie(){
        return altura*base;
    }
    
    public void mostrarRectangulo(){
        System.out.println("BASE DE RECTANGULO: "+getBase());
        System.out.println("ALTURA DE RECTANGULO: "+getAltura());
        System.out.println("PERIMETRO ES: "+obtenerPerimetro());
        System.out.println("SUPERFICIE ES: "+obtenerSuperficie());
    }
    
    
}
