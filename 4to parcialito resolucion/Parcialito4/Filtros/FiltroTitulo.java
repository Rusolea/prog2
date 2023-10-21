package Parcialito4.Filtros;

import Parcialito4.Acta;

public class FiltroTitulo extends Filtro{

    private String titulo;

    public FiltroTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean cumple(Acta acta) {
        return acta.getTitulo().contains(this.titulo);
    }
}
