package punto6.inicio;

import punto6.dominio.GestorRectangulos;
import punto6.dominio.Rectangulo;

public class Principal {

    public static void main(String[] args) {
        Rectangulo rec1 = new Rectangulo(1, 2, 2, 4);
        Rectangulo rec2 = new Rectangulo(12, 10, 4, 6);
        Rectangulo rec3 = new Rectangulo(10, 20, 6, 8);

        GestorRectangulos gestor = new GestorRectangulos();
        gestor.agregarRectangulo(rec1);
        gestor.mostrarRectangulosYDatos();
    }

}
