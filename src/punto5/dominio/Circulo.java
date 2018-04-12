package punto5.dominio;

public class Circulo {
    private double radio;
    private double area;
    
    public Circulo(double radio){
        this.radio=radio;
    }

    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    
    public double calcularArea(){
        area=Math.pow(3.1416*radio,2);
        return this.area;
    }
    
}
