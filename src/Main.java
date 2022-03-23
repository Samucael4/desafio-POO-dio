import desafio.dominio.BootCamp;
import desafio.dominio.Curso;
import desafio.dominio.Dev;
import desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Breve descrição da linguagem Java");
        curso1.setCargaHoraria(1000);


        Curso curso2 = new Curso();
        curso2.setTitulo("JS");
        curso2.setDescricao("Breve descrição da linguagem JS");
        curso2.setCargaHoraria(500);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());


        //System.out.println("\n"+curso1);
        //System.out.println("\n"+curso2);
        //System.out.println("\n"+mentoria);


        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devSamuel = new Dev();
        devSamuel.setNome("Samuel");
        devSamuel.inscreverBootcamp(bootcamp);

        System.out.println("\n"+"Conteudos Inscritos Samuel: " + devSamuel.getConteudosInscritos());

        devSamuel.progredir();
        devSamuel.progredir();
        devSamuel.progredir();

        System.out.println("\n"+"Conteudos Inscritos Samuel: " + devSamuel.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Samuel: " + devSamuel.getConteudosConcluidos());
        System.out.println("XP: "+ devSamuel.calcularTotalXP());

        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);

        System.out.println("\n"+"Conteudos Inscritos João: " + devJoao.getConteudosInscritos());

        devJoao.progredir();

        System.out.println("\n"+"Conteudos Inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: "+ devJoao.calcularTotalXP());


    }
}
