package Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Almacen<T> {
    private List<? super T> elementos;

    public Almacen() {
        elementos = new ArrayList<>();
    }

    public void añadirElemento(T elemento) {
        elementos.add(elemento);
    }

    public void imprimirElementos() {
        for (Object elemento : elementos) {
            System.out.println(elemento.toString());
        }
    }
}
