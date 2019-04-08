package BingoRapido;

import java.util.LinkedList;

public class Carton {

    private int numero;
    private final LinkedList<Integer> tamaño;

    public Carton(int numeroCarton) {
        this.numero = numeroCarton;
        this.tamaño = new LinkedList<>();
    }

    public Carton(LinkedList<Integer> n) {
        this.tamaño = new LinkedList<>(n);
    }

    public int getTamaño() {
        return this.tamaño.size();
    }

    public int getNumeroCarton() {
        return this.numero;
    }

    public LinkedList<Integer> getNumeros() {
        return new LinkedList<>(this.tamaño);
    }
}
