import java.time.LocalDate;

public class Archivo extends ElementoSA{

    private double tamanio;

    public Archivo(String nombre, double tamanio) {
        super(nombre);
        setTamanio(tamanio);
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public double getTamanio() {
        return tamanio;
    }

}
