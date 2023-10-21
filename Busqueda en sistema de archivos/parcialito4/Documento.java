package parcialito4;

import java.util.ArrayList;

public class Documento {
    private String titulo;
    private int anio;
    private ArrayList<String> participantes;
    private String coordinador;
    private int cantPaginas;

    public Documento(String titulo, int anio, String coordinador, int cantPaginas) {
        this.titulo = titulo;
        this.anio = anio;
        this.coordinador = coordinador;
        this.cantPaginas = cantPaginas;
        this.participantes = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnio() {
        return anio;
    }

    public boolean participo(String participante) {
        return participantes.contains(participante);
    }

    public void addParticipante(String participante){
        this.participantes.add(participante);
    }

    public String getCoordinador() {
        return coordinador;
    }

    public int getCantPaginas() {
        return cantPaginas;
    }
}
