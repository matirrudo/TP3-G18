package punto10.dominio;

public class Producto {
    private long codigo;
    private String nombre;
    private double precioUnit;

    public Producto(long codigo, String nombre, double precioUnit) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioUnit = precioUnit;
    }
     
    

    /**
     * @return the codigo
     */
    public long getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precioUnit
     */
    public double getPrecioUnit() {
        return precioUnit;
    }

    /**
     * @param precioUnit the precioUnit to set
     */
    public void setPrecioUnit(double precioUnit) {
        this.precioUnit = precioUnit;
    }
    
}
