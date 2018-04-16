package punto10.inicio;

import java.util.Scanner;
import punto10.dominio.GestorCuotas;
import punto10.dominio.Producto;

public class Principal {

    public static void main(String[] args) {
        double precio;
        long codigo;
        int cuotas;
        String nombre;
        Scanner sc= new Scanner(System.in);
        GestorCuotas gestor = new GestorCuotas();
        
        System.out.println("Ingrese codigo del Producto: ");
        codigo=sc.nextLong();
        System.out.println("Ingrese Nombre del Producto: ");
        nombre=sc.next();
        System.out.println("Ingrese Precio del Producto: ");
        precio=sc.nextDouble();
        
        Producto prod1 = new Producto(codigo, nombre, precio);
        System.out.println("En cuantas cuotas desea pagarlo?: ");
        cuotas=sc.nextInt();
        gestor.calcularCuotas(cuotas, prod1);
        gestor.mostrarProducto(gestor.getListaProductos());
             
        
        
    }

}
