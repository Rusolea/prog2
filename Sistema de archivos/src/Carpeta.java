import java.time.LocalDate;
import java.util.ArrayList;

public class Carpeta extends ElementoSA{
    private ArrayList<ElementoSA> elementos;

    public Carpeta(String nombre) {
        super(nombre);
        elementos = new ArrayList<>();
    }

    public void addElemento(ElementoSA nuevo){
        if (nuevo.getContenedor()!=null) {
            nuevo.getContenedor().eliminar(nuevo);
        }
        elementos.add(nuevo);
        nuevo.setContenedor(this);
    }

    private void eliminar(ElementoSA nuevo) {
        this.elementos.remove(nuevo);
    }

    public double getTamanio(){
        double tamTotal = 0.0;
        for (int i = 0; i < elementos.size(); i++) {
            tamTotal += elementos.get(i).getTamanio();
        }
        return tamTotal;
    }

    public int cantElementos(){
        int cant = super.cantElementos();
        for (int i = 0; i < elementos.size(); i++) {
            ElementoSA elemHijo = elementos.get(i);
            cant += elemHijo.cantElementos();
        }
        return cant;
    }
}
