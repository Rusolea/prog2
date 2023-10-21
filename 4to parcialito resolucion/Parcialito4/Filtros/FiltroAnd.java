package Parcialito4.Filtros;

import Parcialito4.Acta;

public class FiltroAnd extends Filtro{

    private Filtro f1;
    private Filtro f2;

    public FiltroAnd(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean cumple(Acta acta) {
        return this.f1.cumple(acta) && this.f2.cumple(acta);
    }
}
