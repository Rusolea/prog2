package Parcialito4.Filtros;

import Parcialito4.Acta;

public class FiltroCoordinador extends Filtro{

    private String coordinador;

    public FiltroCoordinador(String coordinador) {
        this.coordinador = coordinador;
    }

    @Override
    public boolean cumple(Acta acta) {
        return acta.getCoordinador().equals(this.coordinador);
    }
}
