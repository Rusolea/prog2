package Parcialito4.Filtros;

import Parcialito4.Acta;

public class FiltroParticipante extends Filtro{

    private String participante;

    public FiltroParticipante(String participante) {
        this.participante = participante;
    }

    @Override
    public boolean cumple(Acta acta) {
        return acta.contieneParticipante(this.participante);
    }
}
