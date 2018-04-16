package punto10.dominio;

import java.util.ArrayList;

public class GestorCuotas {
    private ArrayList<Double> listaCuotas=new ArrayList();
    private ArrayList<Producto> listaProductos=new ArrayList();
    
    public void calcularCuotas(int cuotas,Producto a){
        double valorCuota=0,precioAgregado=0, total=0;
        valorCuota= a.getPrecioUnit()/cuotas;
        for (int i = 0; i < cuotas; i++) {
            listaCuotas.add(valorCuota);
            valorCuota=valorCuota+precioAgregado; 
            total=total+valorCuota;
            System.out.println("la cuota "+(i+1)+" es de: "+valorCuota);
            
            precioAgregado=(valorCuota*1.5)/100;
        }
        System.out.println("el precio final es: "+total);
    }
    public void mostrarProducto(ArrayList<Producto> a){
        for (int i = 0; i < a.size(); i++) {
            System.out.println("oooooooooooooooooooooo");
            System.out.println(a.get(i).getCodigo());
            System.out.println(a.get(i).getNombre());
            System.out.println(a.get(i).getPrecioUnit());
            System.out.println("oooooooooooooooooooooo");
        }
    }
   
    public GestorCuotas() {
    }
    /**
     * @return the listaCuotas
     */
    public ArrayList<Double> getListaCuotas() {
        return listaCuotas;
    }

    /**
     * @param listaCuotas the listaCuotas to set
     */
    public void setListaCuotas(ArrayList<Double> listaCuotas) {
        this.listaCuotas = listaCuotas;
    }

    /**
     * @return the listaProductos
     */
    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    /**
     * @param listaProductos the listaProductos to set
     */
    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

}
