package Parcialito4.Filtros;

import Parcialito4.Acta;

public class FiltroNot extends Filtro{

    private Filtro filtro;

    public FiltroNot(Filtro filtro) {
        this.filtro = filtro;
    }

    @Override
    public boolean cumple(Acta acta) {
        return !this.filtro.cumple(acta);
    }
}
