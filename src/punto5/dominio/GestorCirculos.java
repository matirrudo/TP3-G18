package punto5.dominio;

import java.util.ArrayList;

public class GestorCirculos {
    private ArrayList<Circulo> listaCirculos= new ArrayList();
    private ArrayList<Double> listaAreas= new ArrayList();
    private ArrayList<Double> listaRadios= new ArrayList();
    
    public void agregarCirculo(Circulo a){
        this.listaCirculos.add(a);
        this.listaAreas.add(a.getArea());
        this.listaRadios.add(a.getRadio());
    }
    
    public ArrayList<Circulo> getListaCirculos() {
        return listaCirculos;
    }

    public void setListaCirculos(ArrayList<Circulo> listaCirculos) {
        this.listaCirculos = listaCirculos;
    }
}
