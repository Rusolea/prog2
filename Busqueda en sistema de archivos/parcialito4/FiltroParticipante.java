package parcialito4;

public class FiltroParticipante extends Filtro{
    private String participanteBuscado;

    public FiltroParticipante(String participanteBuscado) {
        this.participanteBuscado = participanteBuscado;
    }

    @Override
    public boolean cumple(Documento doc) {
        return doc.participo(participanteBuscado);
    }
}
