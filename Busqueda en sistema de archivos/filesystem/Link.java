package FileSystem;

import java.time.LocalDate;

public abstract class Link extends Elemento{

    private final static double TAMANIO = 1;
    private static String nombrePorDefecto = "Acceso directo a ";
    private Elemento elementoLinkeado;

    public Link(LocalDate fechaCreacion, Elemento elementoLinkeado) {
        super(nombrePorDefecto + elementoLinkeado.getNombre(), fechaCreacion);
        this.elementoLinkeado = elementoLinkeado;
    }

    @Override
    public double getTamanio() {
        return TAMANIO;
    }

    @Override
    public int getCantidadArchivos() {
        return 0;
    }




}
