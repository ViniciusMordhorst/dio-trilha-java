package br.com.dio.desafio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Mentoria mentoria1 = new Mentoria();


        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Desc. Curso Java");
        curso1.setCargaHoraria(86);

        curso2.setTitulo("Curso B");
        curso2.setDescricao("Desc. Curso B");
        curso2.setCargaHoraria(100);

        System.out.println(curso1);
        System.out.println(curso2);

        mentoria1.setTitulo("Mentoria 1");
        mentoria1.setDescricao("Descrição: Mentoria 1");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);
    }
}
