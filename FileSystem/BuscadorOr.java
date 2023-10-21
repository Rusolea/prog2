package FileSystem;

public class BuscadorOr implements Buscador {

    private Buscador buscA;
    private Buscador buscB;

    public BuscadorOr(Buscador buscA, Buscador buscB) {
        this.buscA = buscA;
        this.buscB = buscB;
    }


    @Override
    public boolean cumple(Archivo archivo) {
        return buscA.cumple(archivo) || buscB.cumple(archivo);
    }
}
