package parcialito4;

public class Main {
    public static void main(String[] args) {
        Documento d1 = new Documento("Reunión de inicio",
                2014, "Pedro Almodovar", 1);
        d1.addParticipante("Ricardo Darin");
        d1.addParticipante("Pedro Almodovar");
        d1.addParticipante("Martin Scorsese");
        d1.addParticipante("Julia Roberts");
        d1.addParticipante("Angelina Joulie");

        Documento d2 = new Documento("Concurso de elenco",
                2020, "Pedro Almodovar", 10);
        d2.addParticipante("Pedro Almodovar");
        d2.addParticipante("Martin Scorsese");
        d2.addParticipante("Julia Roberts");
        d2.addParticipante("Angelina Joulie");

        Documento d3 = new Documento("Preparativos para el concurso",
                2020, "Martin Scorsese", 5);
        d3.addParticipante("Martin Scorsese");
        d3.addParticipante("Julia Roberts");
        d3.addParticipante("Angelina Joulie");

        Documento d4 = new Documento("Nominaciones oscar",
                2021, "Martin Scorsese", 31);
        d4.addParticipante("Ricardo Darin");
        d4.addParticipante("Pedro Almodovar");
        d4.addParticipante("Martin Scorsese");
        d4.addParticipante("Julia Roberts");
        d4.addParticipante("Angelina Joulie");

        Documento d5 = new Documento("Estrenos del 2022",
                2022, "Pedro Almodovar", 10);
        d5.addParticipante("Ricardo Darin");
        d5.addParticipante("Pedro Almodovar");
        d5.addParticipante("Martin Scorsese");
        d5.addParticipante("Julia Roberts");
        d5.addParticipante("Angelina Joulie");

        Documento d6 = new Documento("nominaciones 2023",
                2023, "Robert De Niro", 22);
        d6.addParticipante("Ricardo Darin");
        d6.addParticipante("Pedro Almodovar");
        d6.addParticipante("Martin Scorsese");


    }
}
