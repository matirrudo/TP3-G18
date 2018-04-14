package punto6.dominio;

public class Rectangulo {
    private double x;
    private double y;
    private double base;
    private double altura;
    private double sup;
    private double per;
    
    
    public Rectangulo(double x,double y, double base,double altura){
        this.x=x;
        this.y=y;
        this.base=base;
        this.altura=altura;
    }

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
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
    public double getSup() {
        return sup;
    }
    public void setSup(double sup) {
        this.sup = base*altura;
    }
    public double getPer() {
        return per;
    }
    public void setPer(double per) {
        this.per = base*2+altura*2;
    }
}
