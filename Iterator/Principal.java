package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Principal {

    public static void imprimir(Iterable elems){
        for(Object elemento: elems){
            System.out.println(elemento);
        }
    }

    public static void main(String[] args) {
        ArrayList elems = new ArrayList();

        elems.add("a");
        elems.add("b");
        elems.add("c");
        elems.add("d");


        imprimir(elems);

        LIstaVinculada listin = new LIstaVinculada();
        listin.addElemento("a1");
        listin.addElemento("a2");
        listin.addElemento("a3");
        listin.addElemento("a4");

        imprimir(listin);
    }
}
