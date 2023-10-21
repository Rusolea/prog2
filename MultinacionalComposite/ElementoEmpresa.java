package MultinacionalComposite;

import MultinacionalComposite.Filtros.Filtro;

import java.util.ArrayList;
import java.util.Objects;

public abstract class ElementoEmpresa {

    private String nombre;

    public ElementoEmpresa(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        try {
            ElementoEmpresa otro = (ElementoEmpresa) o;
            return this.getNombre().equals(otro.getNombre());
        } catch (Exception e) {
            return false;
        }
    }

    /*
    Determinar la cantidad de empleados de la empresa,
    sucursal, o grupo que tienen una determinada
    especialidad.
     */
    public abstract int getCantEmpleados(Filtro filtro);

    /*
    Obtener la especialidad de un empleado, grupo,
    sucursal y empresa. La especialidad de los grupos,
    sucursales y empresas se determinan como la
    especialidad que es mayoría entre sus miembros
     */
    public abstract String getEspecialidad();

    /*
    Obtener todos los empleados de una empresa,
    sucursal o grupo que tienen una determinada
    especialidad.
     */
    public abstract ArrayList<Empleado> getEmpleados(Filtro filtro);
}
