package FileSystem;

import java.time.LocalDate;
import java.util.ArrayList;

public class Link extends Elemento{

    private final static double TAMANIO = 1;
    private static String nombrePorDefecto = "Acceso directo a ";
    private Elemento elementoLinkeado;

    public Link(LocalDate fechaCreacion, Elemento elementoLinkeado) {
        super(nombrePorDefecto + elementoLinkeado.getNombre(), fechaCreacion);
        this.elementoLinkeado = elementoLinkeado;
    }

    public Elemento getElementoLinkeado() {
        return this.elementoLinkeado;
    }

    @Override
    public ArrayList<Archivo> getArchivosQueCumplen(Buscador buscador) {
        return null;
    }

    @Override
    public double getTamanio() {
        return TAMANIO;
    }

    @Override
    public int getCantidadArchivos() {
        return 0;
    }

    public Elemento getCopia() {
        Link copia = new Link(this.getFechaCreacion(), this.getElementoLinkeado().getCopia());
        return copia;
    }

    public Elemento getCopia(Buscador b) {
        Elemento linkeado = this.getElementoLinkeado().getCopia(b);
        if (linkeado != null) {
            Link copia = new Link(this.getFechaCreacion(), linkeado);
            return copia;
        }
        return null;
    }


}
