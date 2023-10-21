package FileSystem;

import java.time.LocalDate;
import java.util.ArrayList;

public class Comprimido extends Directorio{

    private double tasaCompresion;

    public Comprimido(String nombre, LocalDate fechaCreacion, double tasaCompresion) {
        super(nombre, fechaCreacion);
        this.tasaCompresion = tasaCompresion;
    }

    public double getTasaCompresion() {
        return tasaCompresion;
    }

    public void setTasaCompresion(double tasaCompresion) {
        this.tasaCompresion = tasaCompresion;
    }

    public double getTamanio() {
        return super.getTamanio() * this.getTasaCompresion();
    }

    public Elemento getCopia() {
        Comprimido copia = new Comprimido(this.getNombre(), this.getFechaCreacion(), this.tasaCompresion);
        for (Elemento e: this.elementos) {
            copia.addElemento(e.getCopia());
        }
        return copia;
    }

    public Directorio getDuplicado() {
        return new Comprimido(this.getNombre(), this.getFechaCreacion(), this.tasaCompresion);
    }
}
