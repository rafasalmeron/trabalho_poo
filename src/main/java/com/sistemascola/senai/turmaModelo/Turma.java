package com.sistemascola.senai.turmaModelo;

import com.sistemascola.senai.alunoModelo.Aluno;
import com.sistemascola.senai.professorModelo.Professor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Turma {

    private int id;
    private String numero;
    private List<Aluno> alunos;
    private List<Professor> professores;
    public static List<Turma> listaTurmas = new ArrayList<>();

}
