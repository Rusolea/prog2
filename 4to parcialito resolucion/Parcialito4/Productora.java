package Parcialito4;

import Parcialito4.Filtros.Filtro;

import java.util.ArrayList;

public class Productora {

    private ArrayList<Acta> actas;

    public Productora() {
        this.actas = new ArrayList<>();
    }

    public void addActa(Acta acta) {
        if (!this.actas.contains(acta)) {
            this.actas.add(acta);
        }
    }

    public ArrayList<Acta> getActasQueCumplen(Filtro filtro) {
        ArrayList<Acta> actasFiltradas = new ArrayList<>();
        for (Acta acta: this.actas) {
            if (filtro.cumple(acta)) {
                actasFiltradas.add(acta);
            }
        }
        return actasFiltradas;
    }
}
