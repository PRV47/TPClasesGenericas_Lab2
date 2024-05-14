package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Almacen<E extends Producto> {
    private List<E> productos;

    public Almacen() {
        productos = new ArrayList<>();
    }

    public void añadirProducto(E producto) {
        productos.add(producto);
    }

    public void imprimirProductos() {
        for (E producto : productos) {
            System.out.println(producto);
        }
    }
}
