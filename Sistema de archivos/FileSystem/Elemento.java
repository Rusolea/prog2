package FileSystem;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Elemento {

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

    public boolean esMenor(Elemento elemento) {
        return this.getFechaCreacion().isBefore(elemento.getFechaCreacion());
    }

    public abstract double getTamanio();

    public abstract int getCantidadArchivos();
    public abstract ArrayList<Archivo> getArchivosQueCumplen(Buscador buscador);

    public String getPath() {
        if (this.getPadre() != null )
            return this.getPadre().getPath() +"/"+ this.getNombre();
        else
            return this.getNombre();
    }
}
