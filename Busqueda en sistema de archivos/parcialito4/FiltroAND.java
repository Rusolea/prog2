package parcialito4;

public class FiltroAND extends Filtro{
    private Filtro f1,f2;

    public FiltroAND(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean cumple(Documento doc) {
        return f1.cumple(doc) && f2.cumple(doc);
    }
}
