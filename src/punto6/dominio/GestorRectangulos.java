package punto6.dominio;

import java.util.Arrays;

public class GestorRectangulos {

    private Rectangulo[] vectorRectangulos = new Rectangulo[3];
    private double[] vectorAlturas = new double[3];
    private double[] vectorBases = new double[3];
    private double[] vectorPer = new double[3];
    private double[] vectorSup = new double[3];
    private double[] vectorXs = new double[3];
    private double[] vectorYs = new double[3];

    public GestorRectangulos(){
        
    }
//    public GestorRectangulos(Rectangulo a) {
//        for (int i = 0; i < vectorRectangulos.length; i++) {
//            this.vectorAlturas[i] = a.getAltura();
//            this.vectorBases[i] = a.getBase();
//            this.vectorPer[i] = a.getPer();
//            this.vectorSup[i] = a.getSup();
//            this.vectorXs[i] = a.getX();
//            this.vectorYs[i] = a.getY();
//        }
//    }

    public void mostrarRectangulosYDatos(){
        System.out.println(vectorRectangulos[0].getX());
    }
    public void agregarRectangulo(Rectangulo a) {
        for (int i = 0; i < getVectorRectangulos().length; i++) {
            getVectorRectangulos()[i] = a;
            getVectorAlturas()[i] = a.getBase();
            getVectorBases()[i] = a.getPer();
            getVectorPer()[i] = a.getSup();
            getVectorSup()[i] = a.getX();
            getVectorXs()[i] = a.getY();
            getVectorYs()[i] = a.getY();
        }
    }

    public void eliminarRectangulo(int a, GestorRectangulos b, Rectangulo c) {
        for (int i = 0; i < b.vectorRectangulos.length; i++) {
            if (i == a) {
                getVectorRectangulos()[i] = c;
                getVectorAlturas()[i] = 0;
                getVectorBases()[i] = 0;
                getVectorPer()[i] = 0;
                getVectorSup()[i] = 0;
                getVectorXs()[i] = 0;
                getVectorYs()[i] = 0;
            }
        }
    }

    /**
     * @return the vectorRectangulos
     */
    public Rectangulo[] getVectorRectangulos() {
        return vectorRectangulos;
    }

    /**
     * @param vectorRectangulos the vectorRectangulos to set
     */
    public void setVectorRectangulos(Rectangulo[] vectorRectangulos) {
        this.vectorRectangulos = vectorRectangulos;
    }

    /**
     * @return the vectorAlturas
     */
    public double[] getVectorAlturas() {
        return vectorAlturas;
    }

    /**
     * @param vectorAlturas the vectorAlturas to set
     */
    public void setVectorAlturas(double[] vectorAlturas) {
        this.vectorAlturas = vectorAlturas;
    }

    /**
     * @return the vectorBases
     */
    public double[] getVectorBases() {
        return vectorBases;
    }

    /**
     * @param vectorBases the vectorBases to set
     */
    public void setVectorBases(double[] vectorBases) {
        this.vectorBases = vectorBases;
    }

    /**
     * @return the vectorPer
     */
    public double[] getVectorPer() {
        return vectorPer;
    }

    /**
     * @param vectorPer the vectorPer to set
     */
    public void setVectorPer(double[] vectorPer) {
        this.vectorPer = vectorPer;
    }

    /**
     * @return the vectorSup
     */
    public double[] getVectorSup() {
        return vectorSup;
    }

    /**
     * @param vectorSup the vectorSup to set
     */
    public void setVectorSup(double[] vectorSup) {
        this.vectorSup = vectorSup;
    }

    /**
     * @return the vectorXs
     */
    public double[] getVectorXs() {
        return vectorXs;
    }

    /**
     * @param vectorXs the vectorXs to set
     */
    public void setVectorXs(double[] vectorXs) {
        this.vectorXs = vectorXs;
    }

    /**
     * @return the vectorYs
     */
    public double[] getVectorYs() {
        return vectorYs;
    }

    /**
     * @param vectorYs the vectorYs to set
     */
    public void setVectorYs(double[] vectorYs) {
        this.vectorYs = vectorYs;
    }

}
