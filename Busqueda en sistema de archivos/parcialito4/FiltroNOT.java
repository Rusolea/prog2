package parcialito4;

public class FiltroNOT extends Filtro{
    private Filtro f1;

    public FiltroNOT(Filtro f1) {
        this.f1 = f1;
    }

    @Override
    public boolean cumple(Documento doc) {
        return !f1.cumple(doc);
    }
}
