import desafio.dominio.Curso;
import desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Breve descrição da linguagem Java");
        curso1.setCargaHoraria(1000);
        System.out.println("\n"+curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("JS");
        curso2.setDescricao("Breve descrição da linguagem JS");
        curso2.setCargaHoraria(500);
        System.out.println("\n"+curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        System.out.println("\n"+mentoria);
    }
}
