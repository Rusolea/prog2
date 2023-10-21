package FileSystem;

import java.time.LocalDate;

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


}
