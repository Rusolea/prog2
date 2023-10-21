package Iterator;

import java.util.Iterator;

public class IteradorListaVinculada implements Iterator {
    Nodo primero;

    public IteradorListaVinculada(Nodo p){
        primero = p;
    }
    @Override
    public boolean hasNext() {
        return primero!=null;
    }

    @Override
    public Object next() {
        Object valor = primero.getValor();
        primero = primero.getSiguiente();
        return valor;
    }
}
