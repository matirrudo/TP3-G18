package punto6.dominio;

import java.util.ArrayList;

public class GestorRectangulos {
    private ArrayList<Rectangulo> listaRectangulos= new ArrayList();
    private ArrayList<String> listaNombres= new ArrayList();
    private ArrayList<Double> listaX= new ArrayList();
    private ArrayList<Double> listaY= new ArrayList();
    private ArrayList<Double> listaBase= new ArrayList();
    private ArrayList<Double> listaAltura= new ArrayList();
    private ArrayList<Double> listaSup= new ArrayList();
    private ArrayList<Double> listaPer= new ArrayList();

    public GestorRectangulos(Rectangulo a) {
    }

    
    public void agregarRectangulo(Rectangulo a){
        listaRectangulos.add(a);
        listaNombres.add(a.getNombre());
        listaX.add(a.getX());
        listaY.add(a.getY());
        listaBase.add(a.getBase());
        listaAltura.add(a.getAltura());
        listaSup.add(a.getSup());
        listaPer.add(a.getPer());
        
    }
    public void eliminarRectangulo(int a){
        listaRectangulos.remove(a);
        listaNombres.remove(a);
        listaX.remove(a);
        listaY.remove(a);
        listaBase.remove(a);
        listaAltura.remove(a);
        listaSup.remove(a);
        listaPer.remove(a);
    }
   
    public ArrayList<Rectangulo> getListaRectangulos() {
        return listaRectangulos;
    }

    /**
     * @param listaRectangulos the listaRectangulos to set
     */
    public void setListaRectangulos(ArrayList<Rectangulo> listaRectangulos) {
        this.listaRectangulos = listaRectangulos;
    }

    /**
     * @return the listaNombres
     */
    public ArrayList<String> getListaNombres() {
        return listaNombres;
    }

    /**
     * @param listaNombres the listaNombres to set
     */
    public void setListaNombres(ArrayList<String> listaNombres) {
        this.listaNombres = listaNombres;
    }

    /**
     * @return the listaX
     */
    public ArrayList<Double> getListaX() {
        return listaX;
    }

    /**
     * @param listaX the listaX to set
     */
    public void setListaX(ArrayList<Double> listaX) {
        this.listaX = listaX;
    }

    /**
     * @return the listaY
     */
    public ArrayList<Double> getListaY() {
        return listaY;
    }

    /**
     * @param listaY the listaY to set
     */
    public void setListaY(ArrayList<Double> listaY) {
        this.listaY = listaY;
    }

    /**
     * @return the listaBase
     */
    public ArrayList<Double> getListaBase() {
        return listaBase;
    }

    /**
     * @param listaBase the listaBase to set
     */
    public void setListaBase(ArrayList<Double> listaBase) {
        this.listaBase = listaBase;
    }

    /**
     * @return the listaAltura
     */
    public ArrayList<Double> getListaAltura() {
        return listaAltura;
    }

    /**
     * @param listaAltura the listaAltura to set
     */
    public void setListaAltura(ArrayList<Double> listaAltura) {
        this.listaAltura = listaAltura;
    }

    /**
     * @return the listaSup
     */
    public ArrayList<Double> getListaSup() {
        return listaSup;
    }

    /**
     * @param listaSup the listaSup to set
     */
    public void setListaSup(ArrayList<Double> listaSup) {
        this.listaSup = listaSup;
    }

    /**
     * @return the listaPer
     */
    public ArrayList<Double> getListaPer() {
        return listaPer;
    }

    /**
     * @param listaPer the listaPer to set
     */
    public void setListaPer(ArrayList<Double> listaPer) {
        this.listaPer = listaPer;
    }
    
}
