package Iterator;

public class Nodo {

    Object valor;
    Nodo siguiente;

    public Object getValor() {
        return valor;
    }

    public Nodo(Object valor) {
        this.siguiente = null;
        this.valor = valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
