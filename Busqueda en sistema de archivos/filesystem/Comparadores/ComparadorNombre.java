package FileSystem.Comparadores;

import FileSystem.Elemento;

import java.util.Comparator;

public class ComparadorNombre implements Comparator<Elemento> {


    @Override
    public int compare(Elemento o1, Elemento o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}
