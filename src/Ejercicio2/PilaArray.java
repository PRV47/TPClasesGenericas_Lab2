package Ejercicio2;

import java.util.NoSuchElementException;

public class PilaArray<E> {
    E[] array;
    int contador;

    public PilaArray(int tamañoMaximo) {
        array = (E[]) new Object[tamañoMaximo];
        contador = 0;
    }

    public boolean estaVacia() {
        return contador == 0;
    }

    public boolean añadir(E obj) {
        if (contador == array.length) {
            return false;
        }
        array[contador] = obj;
        contador++;
        return true;
    }

    public E primero() {
        if (estaVacia()) {
            throw new NoSuchElementException();
        }
        return array[contador - 1];
    }

    public E extraer() {
        if (estaVacia()) {
            throw new NoSuchElementException();
        }
        E obj = array[contador - 1];
        contador--;
        return obj;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < contador; i++) {
            sb.append(array[i].toString());
            if (i < contador - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
