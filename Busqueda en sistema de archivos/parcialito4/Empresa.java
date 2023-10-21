package parcialito4;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Documento> documentos;

    public Empresa() {
        this.documentos = new ArrayList<>();
    }

    public void addDocumento(Documento doc){
        documentos.add(doc);
    }

    public ArrayList<Documento> buscar(Filtro filtro){
        ArrayList<Documento> losQueCumplen = new ArrayList<>();
        for (int i = 0; i < documentos.size(); i++) {
            if (filtro.cumple(documentos.get(i)))
                losQueCumplen.add(documentos.get(i));
        }
        return losQueCumplen;
    }
}
