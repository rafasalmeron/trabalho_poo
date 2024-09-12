package com.sistemascola.senai.alunoModelo;
import java.io.Serializable;
import java.util.Scanner;

public interface Cadastrar extends Serializable {
    static void cadastrarAluno(){
        Scanner scanLocal  = new Scanner(System.in);
        System.out.println("""
                  Cadastro de Aluno
                
                Insira o nome do aluno:
                """);
        Aluno a = new Aluno();
        a.setNome(scanLocal.nextLine());
        System.out.println("Qual o CPF?");
        a.setCpf(scanLocal.nextLine());
        Aluno.listaAlunos.add(a);
        System.out.println("Aluno Cadastrado com Sucesso!");
    }
}
