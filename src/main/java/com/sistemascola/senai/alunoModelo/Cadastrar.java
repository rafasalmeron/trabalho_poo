package com.sistemascola.senai.alunoModelo;

import com.sistemascola.senai.global.GlobalScanner;

import java.io.Serializable;

public interface Cadastrar extends Serializable {
    static void cadastrarAluno(){
        System.out.println("""
                  Cadastro de Aluno
                
                Insira o nome do aluno:
                """);
        Aluno a = new Aluno();
        a.setNome(GlobalScanner.scan.nextLine());
        System.out.println("Qual o CPF?");
        a.setCpf(GlobalScanner.scan.nextLine());
        Aluno.listaAlunos.add(a);
        System.out.println("Aluno Cadastrado com Sucesso!");
    }
}
