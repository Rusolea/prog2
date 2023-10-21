package MultinacionalComposite;


import MultinacionalComposite.Filtros.Filtro;

import java.util.ArrayList;
import java.util.Collections;

public class Sucursal extends ElementoEmpresa{

    private ArrayList<ElementoEmpresa> elementos;

    public Sucursal(String nombre) {
        super(nombre);
        this.elementos = new ArrayList<>();
    }

    @Override
    public int getCantEmpleados(Filtro filtro) {
        int contador = 0;
        for (ElementoEmpresa e: this.elementos) {
            contador += e.getCantEmpleados(filtro);
        }
        return contador;
    }

    @Override
    public String getEspecialidad() {
        ArrayList<String> especialidades = new ArrayList<>();
        String especialidadMayoria = "";
        int cantidadMayor = 0;
        String espAux = "";
        int cantAux = 0;
        for (ElementoEmpresa e: this.elementos ) {
            especialidades.add(e.getEspecialidad());
        }
        Collections.sort(especialidades);
        espAux = especialidades.get(0);
        for (String especialidad : especialidades) {
            if (espAux.equals(especialidad)) {
                cantAux++;
                if (cantAux > cantidadMayor) {
                    cantidadMayor = cantAux;
                    especialidadMayoria = espAux;
                }
            } else {
                espAux = especialidad;
                cantAux = 1;
            }
        }
        return especialidadMayoria;
    }

    @Override
    public ArrayList<Empleado> getEmpleados(Filtro filtro) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        for (ElementoEmpresa e: this.elementos  ) {
            empleados.addAll(e.getEmpleados(filtro));
        }
        return empleados;
    }

    public void addElemento(ElementoEmpresa e) {
        if (!this.elementos.contains(e)) { //redefinir equals
            this.elementos.add(e);
        }
    }
}
