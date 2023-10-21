package Iterator;

import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

public class LIstaVinculada implements Iterable{

    Nodo primero;
    Nodo ultimo;



    public LIstaVinculada(){
        primero=null;
        ultimo = null;
    }

    public void addElemento(Object o1){
        if (primero ==null){
            primero = new Nodo(o1);
            primero = new Nodo(o1);
            ultimo = primero;
        } else {
            Nodo aux = new Nodo(o1);
            ultimo.setSiguiente(aux);
            ultimo = aux;
        }

    }

    @Override
    public Iterator iterator() {
        return new IteradorListaVinculada(primero);
    }
}
