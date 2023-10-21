package Parcialito4;

import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

public class Acta {

    private String titulo;
    private int anioEmision;
    private String coordinador;
    private int cantPaginas;
    private ArrayList<String> participantes;

    public Acta(String titulo, int anioEmision, String coordinador, int cantaginas) {
        this.titulo = titulo;
        this.anioEmision = anioEmision;
        this.coordinador = coordinador;
        this.cantPaginas = cantaginas;
        this.participantes = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioEmision() {
        return anioEmision;
    }

    public void setAnioEmision(int anioEmision) {
        this.anioEmision = anioEmision;
    }

    public String getCoordinador() {
        return coordinador;
    }

    public void setCoordinador(String coordinador) {
        this.coordinador = coordinador;
    }

    public int getCantPaginas() {
        return cantPaginas;
    }

    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }

    public void addParticipante(String participante) {
        if (!this.participantes.contains(participante)) {
            this.participantes.add(participante);
        }
    }

    @Override
    public boolean equals(Object o) {
        try {
            Acta otra = (Acta) o;
            return this.getTitulo().equals(otra.getTitulo());
        } catch (Exception e) {
            System.out.println("No es un Acta");
        }
        return false;
    }

    public boolean contieneParticipante(String participante) {
        return this.participantes.contains(participante);
    }

    public String toString() {
        return "Titulo: " + this.getTitulo();
    }
}
