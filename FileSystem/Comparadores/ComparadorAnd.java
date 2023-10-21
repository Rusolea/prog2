package FileSystem.Comparadores;

import FileSystem.Elemento;

import java.util.Comparator;

public class ComparadorAnd implements Comparator<Elemento> {

    private Comparator comp1;
    private Comparator comp2;

    public ComparadorAnd(Comparator comp1, Comparator comp2) {
        this.comp1 = comp1;
        this.comp2 = comp2;
    }

    @Override
    public int compare(Elemento o1, Elemento o2) {
         int resultado = this.comp1.compare(o1, o2);
         if (resultado == 0) {
             resultado = this.comp2.compare(o1, o2);
         }
         return resultado;
    }
}
