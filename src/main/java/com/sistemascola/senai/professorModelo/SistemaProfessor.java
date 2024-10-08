package com.sistemascola.senai.professorModelo;

import com.sistemascola.senai.alunoModelo.Listar;
import com.sistemascola.senai.avaliacoes.Avaliacao;
import lombok.extern.slf4j.Slf4j;

import java.util.InputMismatchException;
import java.util.Scanner;
import static com.sistemascola.senai.alunoModelo.Aluno.listaAlunos;
import static com.sistemascola.senai.avaliacoes.Avaliacao.listaAvaliacoes;
import static com.sistemascola.senai.disciplinaModelo.Disciplina.disciplinaList;

@Slf4j
public class SistemaProfessor {
    public static void notas() {
        System.out.println("""
                Qual Bimestre você deseja alterar/lançar nota?
                
                Digite 1 - Bimestre 1
                Digite 2 - Bimestre 2
                Digite 3 - Bimestre 3
                Digite 4 - Bimestre 4
                """);
        int opt = new Scanner(System.in).nextInt();
        switch (opt){
            case 1 -> {
                try {
                    System.out.println("Qual o nome do Aluno?");
                    String nomeAluno = new Scanner(System.in).nextLine();

                    System.out.println("Qual a disciplina?");
                    String disciplina = new Scanner(System.in).nextLine();

                    System.out.println("Qual a nota da disciplina?");
                    double nota = new Scanner(System.in).nextDouble();

                    for (int i = 0; i < listaAlunos.size(); i++) {
                        for (int j = 0; j < disciplinaList.size(); j++) {
                            if(listaAlunos
                                    .get(i)
                                    .getNome()
                                    .equals(nomeAluno)
                                    && disciplinaList
                                    .get(j)
                                    .getNome()
                                    .equals(disciplina)
                            )
                            {
                                listaAvaliacoes.get(i).setNota1(nota);
                                for (Avaliacao avaliacao : listaAvaliacoes){
                                    if(avaliacao
                                            .getDisciplina()
                                            .equals(disciplinaList.get(j)))
                                    {
                                        avaliacao.setAluno(listaAlunos.get(i));
                                    }
                                }
                                System.out.printf("""
                                Nome: %s
                                Disciplina: %s
                                Nota Bimestre 1: %f
                                """,nomeAluno,
                                        disciplina,
                                        listaAvaliacoes.get(i).getNota1());
                                return;
                            }
                        }
                    }
                }catch (InputMismatchException e){
                    SistemaProfessor.log.error("Erro de input, Verifique se lançou a nota utilizando números.", e);
                }
            }
            case 2 -> {
                try {
                    System.out.println("Qual o nome do Aluno?");
                    String nomeAluno = new Scanner(System.in).nextLine();

                    System.out.println("Qual a disciplina?");
                    String disciplina = new Scanner(System.in).nextLine();

                    System.out.println("Qual a nota da disciplina?");
                    double nota = new Scanner(System.in).nextDouble();

                    for (int i = 0; i < listaAlunos.size(); i++) {
                        for (int j = 0; j < disciplinaList.size(); j++) {
                            if(listaAlunos
                                    .get(i)
                                    .getNome()
                                    .equals(nomeAluno)
                                    && disciplinaList
                                    .get(j)
                                    .getNome()
                                    .equals(disciplina)
                            )
                            {
                                listaAvaliacoes.get(i).setNota1(nota);
                                for (Avaliacao avaliacao : listaAvaliacoes){
                                    if(avaliacao
                                            .getDisciplina()
                                            .equals(disciplinaList.get(j)))
                                    {
                                        avaliacao.setAluno(listaAlunos.get(i));
                                    }
                                }
                                System.out.printf("""
                                Nome: %s
                                Disciplina: %s
                                Nota Bimestre 2: %f
                                """,nomeAluno,
                                        disciplina,
                                        listaAvaliacoes.get(i).getNota2());
                                return;
                            }
                        }
                    }
                }catch (InputMismatchException e){
                    SistemaProfessor.log.error("Erro de input, Verifique se lançou a nota utilizando números.", e);
                }
            }
            case 3 -> {
                try {
                    System.out.println("Qual o nome do Aluno?");
                    String nomeAluno = new Scanner(System.in).nextLine();

                    System.out.println("Qual a disciplina?");
                    String disciplina = new Scanner(System.in).nextLine();

                    System.out.println("Qual a nota da disciplina?");
                    double nota = new Scanner(System.in).nextDouble();

                    for (int i = 0; i < listaAlunos.size(); i++) {
                        for (int j = 0; j < disciplinaList.size(); j++) {
                            if(listaAlunos
                                    .get(i)
                                    .getNome()
                                    .equals(nomeAluno)
                                    && disciplinaList
                                    .get(j)
                                    .getNome()
                                    .equals(disciplina)
                            )
                            {
                                listaAvaliacoes.get(i).setNota1(nota);
                                for (Avaliacao avaliacao : listaAvaliacoes){
                                    if(avaliacao
                                            .getDisciplina()
                                            .equals(disciplinaList.get(j)))
                                    {
                                        avaliacao.setAluno(listaAlunos.get(i));
                                    }
                                }
                                System.out.printf("""
                                Nome: %s
                                Disciplina: %s
                                Nota Bimestre 3: %f
                                """,nomeAluno,
                                        disciplina,
                                        listaAvaliacoes.get(i).getNota3());
                                return;
                            }
                        }
                    }
                }catch (InputMismatchException e){
                    SistemaProfessor.log.error("Erro de input, Verifique se lançou a nota utilizando números.", e);
                }
            }
            case 4 -> {
                try {
                    System.out.println("Qual o nome do Aluno?");
                    String nomeAluno = new Scanner(System.in).nextLine();

                    System.out.println("Qual a disciplina?");
                    String disciplina = new Scanner(System.in).nextLine();

                    System.out.println("Qual a nota da disciplina?");
                    double nota = new Scanner(System.in).nextDouble();

                    for (int i = 0; i < listaAlunos.size(); i++) {
                        for (int j = 0; j < disciplinaList.size(); j++) {
                            if(listaAlunos
                                    .get(i)
                                    .getNome()
                                    .equals(nomeAluno)
                                    && disciplinaList
                                    .get(j)
                                    .getNome()
                                    .equals(disciplina)
                            )
                            {
                                listaAvaliacoes.get(i).setNota1(nota);
                                for (Avaliacao avaliacao : listaAvaliacoes){
                                    if(avaliacao
                                            .getDisciplina()
                                            .equals(disciplinaList.get(j)))
                                    {
                                        avaliacao.setAluno(listaAlunos.get(i));
                                    }
                                }
                                System.out.printf("""
                                Nome: %s
                                Disciplina: %s
                                Nota Bimestre 4: %f
                                """,nomeAluno,
                                        disciplina,
                                        listaAvaliacoes.get(i).getNota4());
                                return;
                            }
                        }
                    }
                }catch (InputMismatchException e){
                    SistemaProfessor.log.error("Erro de input, Verifique se lançou a nota utilizando números.", e);
                }
            }
        }
    }

    public static void menuProfessor() {
        Scanner sc = new Scanner(System.in);
        int option = 20;

        do {
            System.out.println("""
                
                  - Sistema Professor -
                
                1 - Lançar Nota
                2 - Consultar Alunos
                3 - Listar Alunos e suas notas
                0 - Sair
                
                """);
            try {
                option = sc.nextInt();
                switch (option){
                    case 1 -> notas();
                    case 2 -> ConsultarAlunos.consultarAlunos();
                    case 3 -> Listar.listarAlunos(); // Precisa inserir as notas na consulta
                    case 0 -> System.out.println("Sair");
                    default -> System.out.println("Opção inválida!");
                }
            }catch (InputMismatchException e){
                SistemaProfessor.log.error("Verifique se utilizou números para sua escolha.", e);
            }
        }while(option != 0);
    }
}

