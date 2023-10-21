package parcialito4;

public class FiltroTitulo extends Filtro{
    String subcadena;

    public FiltroTitulo(String subcadena) {
        this.subcadena = subcadena;
    }

    @Override
    public boolean cumple(Documento doc) {
        return doc.getTitulo().contains(subcadena);
    }
}
