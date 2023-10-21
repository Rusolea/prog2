package FileSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class Elemento implements Comparable<Elemento>{

    private String nombre;
    private LocalDate fechaCreacion;
    private Directorio padre;

    public Elemento(String nombre, LocalDate fechaCreacion) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }


    public Directorio getPadre() {
        return padre;
    }

    public void setPadre(Directorio padre) {
        this.padre = padre;
    }


    public abstract double getTamanio();

    public abstract int getCantidadArchivos();


    public String getPath() {
        if (this.getPadre() != null )
            return this.getPadre().getPath() +"/"+ this.getNombre();
        else
            return this.getNombre();
    }

    public boolean esMenor(Elemento elemento) {
        return this.getFechaCreacion().isBefore(elemento.getFechaCreacion());
    }

    public abstract ArrayList<Archivo> getArchivosQueCumplen(Buscador buscador);

    public ArrayList<Archivo> getArchivosQueCumplenOrdenados(Buscador b, Comparator c) {
        ArrayList<Archivo> archivos = this.getArchivosQueCumplen(b);
        Collections.sort(archivos, c);
        return archivos;
    }


    @Override
    public int compareTo(Elemento e) {
        if (this.getFechaCreacion().isBefore(e.getFechaCreacion())) {
            return -1;
        } else if (this.getFechaCreacion().isAfter(e.getFechaCreacion())) {
            return 1;
        } else
            return 0;
    }
}
