package MultinacionalComposite.Filtros;

import MultinacionalComposite.Empleado;

public class FiltroEspecialidad implements Filtro{

    String especialidad;

    public FiltroEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public boolean cumple(Empleado empleado) {
        return empleado.getEspecialidad().equals(this.especialidad);
    }
}
