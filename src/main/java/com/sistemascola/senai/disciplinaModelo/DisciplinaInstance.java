package com.sistemascola.senai.disciplinaModelo;

public interface DisciplinaInstance {
    static void disciplinasInstance(){
        Disciplina matematica = new Disciplina();
        matematica.setNome("Matematica");
        matematica.setId(1);
        Disciplina.disciplinaList.add(matematica);

        Disciplina portugues = new Disciplina();
        portugues.setNome("Português");
        portugues.setId(2);
        Disciplina.disciplinaList.add(portugues);

        Disciplina historia = new Disciplina();
        historia.setNome("História");
        historia.setId(3);
        Disciplina.disciplinaList.add(historia);

        Disciplina geografia = new Disciplina();
        geografia.setNome("Geografia");
        geografia.setId(4);
        Disciplina.disciplinaList.add(geografia);

        Disciplina fisica = new Disciplina();
        fisica.setNome("Física");
        fisica.setId(5);
        Disciplina.disciplinaList.add(fisica);

        Disciplina quimica = new Disciplina();
        quimica.setNome("Química");
        quimica.setId(6);
        Disciplina.disciplinaList.add(quimica);

        Disciplina biologia = new Disciplina();
        biologia.setNome("Biologia");
        biologia.setId(7);
        Disciplina.disciplinaList.add(biologia);

        Disciplina ingles = new Disciplina();
        ingles.setNome("Inglês");
        ingles.setId(8);
        Disciplina.disciplinaList.add(ingles);

        Disciplina artes = new Disciplina();
        artes.setNome("Artes");
        artes.setId(9);
        Disciplina.disciplinaList.add(artes);

        Disciplina educacaoFisica = new Disciplina();
        educacaoFisica.setNome("Educação Física");
        educacaoFisica.setId(10);
        Disciplina.disciplinaList.add(educacaoFisica);
    }
}

