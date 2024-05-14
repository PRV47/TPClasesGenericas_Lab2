package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Almacen<Producto> almacen = new Almacen<>();
        almacen.añadirProducto(new Producto("Manzana Roja", 5));
        almacen.añadirProducto(new Producto("Televisor LED", 5000));
        almacen.imprimirProductos();
    }
}
