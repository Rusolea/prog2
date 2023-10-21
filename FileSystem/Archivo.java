package FileSystem;

import java.time.LocalDate;
import java.util.ArrayList;

public class Archivo extends Elemento{

    private double tamanio;

    public Archivo(String nombre, LocalDate fechaCreacion, double tamanio) {
        super(nombre, fechaCreacion);
        this.tamanio = tamanio;
    }

    public double getTamanio() {
        return tamanio;
    }

    @Override
    public int getCantidadArchivos() {
        return 1;
    }

    @Override
    public Archivo getCopia() {
        Archivo copia = new Archivo(this.getNombre(), this.getFechaCreacion(), this.tamanio);
        return copia;
    }

    @Override
    public Elemento getCopia(Buscador b) {
        if (b.cumple(this)){
            return this.getCopia();
        }
        return null;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public ArrayList<Archivo> getArchivosQueCumplen(Buscador buscador) {
        ArrayList<Archivo> archivos = new ArrayList<>();
        if (buscador.cumple(this)) {
            archivos.add(this.getCopia());
        }
        return archivos;
    }

    @Override
    public String toString() {
        return this.getNombre();
    }


    public boolean contienePalabra(String palabra) {
        return this.getNombre().contains(palabra);
    }
}
