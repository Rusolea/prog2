package FileSystem.Comparadores;

import FileSystem.Elemento;

import java.util.Comparator;

public class ComparadorTamanio implements Comparator<Elemento> {

    @Override
    public int compare(Elemento o1, Elemento o2) {
        return Double.compare(o1.getTamanio(), o2.getTamanio());

    }
}
