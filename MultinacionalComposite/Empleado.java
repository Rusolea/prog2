package MultinacionalComposite;

import MultinacionalComposite.Filtros.Filtro;

import java.util.ArrayList;

public class Empleado extends ElementoEmpresa{

    private String especialidad;
    private double sueldo;

    public Empleado(String nombre, String especialidad, double sueldo) {
        super(nombre);
        this.especialidad = especialidad;
        this.sueldo = sueldo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public ArrayList<Empleado> getEmpleados(Filtro filtro) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        if (filtro.cumple(this))
            empleados.add(this.getCopia());
        return empleados;
    }

    private Empleado getCopia() {
        return new Empleado(this.getNombre(), this.getEspecialidad(), this.getSueldo());
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public int getCantEmpleados(Filtro filtro) {
        if (filtro.cumple(this))
            return 1;
        return 0;
    }
}
