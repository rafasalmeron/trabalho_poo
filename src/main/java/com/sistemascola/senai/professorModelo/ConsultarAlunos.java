package com.sistemascola.senai.professorModelo;

import com.sistemascola.senai.alunoModelo.Aluno;

import static com.sistemascola.senai.alunoModelo.Aluno.listaAlunos;

public interface ConsultarAlunos {
    static void consultarAlunos(){
        if(listaAlunos.isEmpty()){
            System.out.println("Nenhum Aluno Cadastrado");
        }
        for (Aluno a : listaAlunos) {
            System.out.printf("""
                                
                                ° Nome: %s
                                ° CPF: %s
                                ° Matricula: %s
                                ° Data de Matricula: %s
                                
                                """, a.getNome(), a.getCpf(), a.getMatricula(), a.getMatriculadoEm()
            );
        }
    }
}
