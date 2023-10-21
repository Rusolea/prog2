package Parcialito4.Filtros;

import Parcialito4.Acta;

public class FiltroAnio extends Filtro{

    private int anio;

    public FiltroAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public boolean cumple(Acta acta) {
        return acta.getAnioEmision() < this.anio;
    }
}
