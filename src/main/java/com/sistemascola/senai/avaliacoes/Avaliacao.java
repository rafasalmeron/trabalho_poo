package com.sistemascola.senai.avaliacoes;

import com.sistemascola.senai.disciplinaModelo.Disciplina;
import com.sistemascola.senai.alunoModelo.Aluno;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Avaliacao {
        private Aluno aluno;
        private Disciplina disciplina;
        private double nota1 = 0;
        private double nota2 = 0;
        private double nota3 = 0;
        private double nota4 = 0;
        private double media;
        public static List<Avaliacao> listaAvaliacoes = new ArrayList<>();
}

