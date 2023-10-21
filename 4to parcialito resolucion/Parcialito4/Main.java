package Parcialito4;

import Parcialito4.Filtros.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //creamos la productora
        Productora productora = new Productora();
        //creamos las actas y les agregamos participantes
        Acta acta1 = new Acta("concurso", 2021, "Pedro Almodovar", 15);
        acta1.addParticipante("Luis");
        acta1.addParticipante("Marcelo");
        acta1.addParticipante("Ariel");
        Acta acta2 = new Acta("contratacion", 2023, "Martin Scorsese", 5);
        acta2.addParticipante("Lucas");
        acta2.addParticipante("Caetano");
        Acta acta3 = new Acta("convocatoria", 2020, "Pedro Almodovar", 3);
        acta3.addParticipante("Matias");
        acta3.addParticipante("Gonzalo");
        //agregamos las actas a la productora
        productora.addActa(acta1);
        productora.addActa(acta2);
        productora.addActa(acta3);

        //realizamos las búsquedas

        System.out.println("Buscar todas las actas y/o resoluciones que en el título contenga la palabra “concurso” y cuyo año sea anterior a 2022.");
        FiltroTitulo fTitulo = new FiltroTitulo("concurso");
        FiltroAnio fAnio= new FiltroAnio(2022);
        FiltroAnd fAnd = new FiltroAnd(fTitulo, fAnio);
        ArrayList<Acta> actas = productora.getActasQueCumplen(fAnd);
        for (Acta a: actas ) {
            System.out.println(a);
        }

        System.out.println("Buscar todas las actas y/o resoluciones en cuya lista de participantes NO contenga a “Robert de Niro” y cuyo coordinador haya sido “Pedro Almodovar”.");
        FiltroParticipante fPartic = new FiltroParticipante("Robert de Niro");
        FiltroNot fNot = new FiltroNot(fPartic);
        FiltroCoordinador fCoord = new FiltroCoordinador("Pedro Almodovar");
        FiltroAnd fAnd2 = new FiltroAnd(fNot, fCoord);
        actas = productora.getActasQueCumplen(fAnd2);
        for (Acta a: actas ) {
            System.out.println(a);
        }

        System.out.println("Buscar todas las actas y/o resoluciones cuya cantidad de páginas sea menor a 20 y cuyo coordinador NO haya sido “Martin Scorsese”.");
        FiltroCantPaginas fCantPag = new FiltroCantPaginas(20);
        FiltroCoordinador fCoord2 = new FiltroCoordinador("Martin Scorsese");
        FiltroNot fNot2 = new FiltroNot(fCoord2);
        FiltroAnd fAnd3 = new FiltroAnd(fCantPag, fNot2);
        actas = productora.getActasQueCumplen(fAnd3);
        for (Acta a: actas ) {
            System.out.println(a);
        }
    }
}
