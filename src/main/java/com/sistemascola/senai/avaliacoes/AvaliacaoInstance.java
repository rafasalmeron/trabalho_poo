package com.sistemascola.senai.avaliacoes;

import com.sistemascola.senai.disciplinaModelo.Disciplina;

public interface AvaliacaoInstance {
    static void avaliacaoInstance(){

        Avaliacao avaliacao1 = new Avaliacao();
        avaliacao1.setDisciplina(Disciplina.disciplinaList.get(0));
        Avaliacao.listaAvaliacoes.add(avaliacao1);

        Avaliacao avaliacao2 = new Avaliacao();
        avaliacao2.setDisciplina(Disciplina.disciplinaList.get(1));
        Avaliacao.listaAvaliacoes.add(avaliacao2);

        Avaliacao avaliacao3 = new Avaliacao();
        avaliacao3.setDisciplina(Disciplina.disciplinaList.get(2));
        Avaliacao.listaAvaliacoes.add(avaliacao3);

        Avaliacao avaliacao4 = new Avaliacao();
        avaliacao4.setDisciplina(Disciplina.disciplinaList.get(3));
        Avaliacao.listaAvaliacoes.add(avaliacao4);

        Avaliacao avaliacao5 = new Avaliacao();
        avaliacao5.setDisciplina(Disciplina.disciplinaList.get(4));
        Avaliacao.listaAvaliacoes.add(avaliacao5);

        Avaliacao avaliacao6 = new Avaliacao();
        avaliacao6.setDisciplina(Disciplina.disciplinaList.get(5));
        Avaliacao.listaAvaliacoes.add(avaliacao6);

        Avaliacao avaliacao7 = new Avaliacao();
        avaliacao7.setDisciplina(Disciplina.disciplinaList.get(6));
        Avaliacao.listaAvaliacoes.add(avaliacao7);

        Avaliacao avaliacao8 = new Avaliacao();
        avaliacao8.setDisciplina(Disciplina.disciplinaList.get(7));
        Avaliacao.listaAvaliacoes.add(avaliacao8);

        Avaliacao avaliacao9 = new Avaliacao();
        avaliacao9.setDisciplina(Disciplina.disciplinaList.get(8));
        Avaliacao.listaAvaliacoes.add(avaliacao9);

        Avaliacao avaliacao10 = new Avaliacao();
        avaliacao10.setDisciplina(Disciplina.disciplinaList.get(9));
        Avaliacao.listaAvaliacoes.add(avaliacao10);
    }
}
