package com.sistemascola.senai.alunoModelo;

import static com.sistemascola.senai.alunoModelo.Aluno.listaAlunos;

public interface Listar {
    static void listarAlunos(){
        if(listaAlunos.isEmpty()){
            System.out.println("Nenhum Aluno Cadastrado");
        }
        for (Aluno a : listaAlunos) {
            System.out.printf("""
                                
                                ° Nome: %s
                                ° CPF: %s
                                ° Matricula: %s
                                
                                """, a.getNome(), a.getCpf(), a.getMatricula()
            );
        }
    };
}
