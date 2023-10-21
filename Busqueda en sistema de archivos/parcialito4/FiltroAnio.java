package parcialito4;

public class FiltroAnio extends Filtro{
    private int anioLimite;

    public FiltroAnio(int anioLimite) {
        this.anioLimite = anioLimite;
    }


    @Override
    public boolean cumple(Documento doc) {
        if ( doc.getAnio() < anioLimite )
            return true;
        return false;
    }
}
