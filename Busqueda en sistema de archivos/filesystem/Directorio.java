package FileSystem;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Directorio extends Elemento{

    private ArrayList<Elemento> elementos;

public void addElemento(Elemento e) {
    //validar que no se duplique un elemento
    this.elementos.add(e);
    e.setPadre(this);
}

    public Directorio(String nombre, LocalDate fechaCreacion) {
        super(nombre, fechaCreacion);
        this.elementos = new ArrayList<>();
    }

    public double getTamanio() {
        double acum = 0;
        for (int i = 0; i < this.elementos.size(); i++ ) {
            acum += this.elementos.get(i).getTamanio();
        }
        return acum;
    }

    public int getCantidadElementos() {
        return this.elementos.size();
    }

    public int getCantidadArchivos() {
        int archivos = 0;
        for (int i = 0; i < this.elementos.size(); i++ ) {
            archivos += this.elementos.get(i).getCantidadArchivos();
        }
        return archivos;
    }

    public ArrayList<Archivo> getArchivosQueCumplen(Buscador buscador) {
        ArrayList<Archivo> archivos = new ArrayList<>();
        for (Elemento elemento:this.elementos) {
            archivos.addAll(elemento.getArchivosQueCumplen(buscador));
        }
        return archivos;
    }

    @Override
    public String toString() {
        String path = this.getNombre();
        for (Elemento e: this.elementos ) {
            path += this.getNombre() + "/" + e.toString() + "/n";
        }
        return path;
    }

    /**
     * TUDAI
     * TUDAI/1eranio/Prog2/Parcial.doc
     * TUDAI/1eranio/Prog2/Recu.pdf
     * TUDAI/1eranio/Prog2/Prefi.txt
     * TUDAI/2doanio
     */
}
