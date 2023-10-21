package Parcialito4.Filtros;

import Parcialito4.Acta;

public class FiltroCantPaginas extends Filtro{

    private int cantPag;

    public FiltroCantPaginas(int cantPag) {
        this.cantPag = cantPag;
    }

    @Override
    public boolean cumple(Acta acta) {
        return acta.getCantPaginas() < this.cantPag;
    }
}
