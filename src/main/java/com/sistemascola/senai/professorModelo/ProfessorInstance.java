package com.sistemascola.senai.professorModelo;

import com.sistemascola.senai.disciplinaModelo.Disciplina;
import com.sistemascola.senai.disciplinaModelo.DisciplinaInstance;
import java.util.List;
import static com.sistemascola.senai.professorModelo.Professor.professores;

public interface ProfessorInstance {
    static void professorInstance(){
        DisciplinaInstance.disciplinasInstance();
        Professor professor1 = new Professor();
        professor1.setNome("Arthur");
        professor1.setUsuario("arthur");
        professor1.setSenha("123");
        professor1.setDisciplinas(List.of(
                Disciplina.disciplinaList.get(0), // Matematica
                Disciplina.disciplinaList.get(4)  // Física
        ));
        professores.add(professor1);

        Professor professor2 = new Professor();
        professor2.setNome("Roni");
        professor2.setUsuario("roni");
        professor2.setSenha("123");
        professor2.setDisciplinas(List.of(
                Disciplina.disciplinaList.get(1), // Português
                Disciplina.disciplinaList.get(2)  // História
        ));
        professores.add(professor2);

        Professor professor3 = new Professor();
        professor3.setNome("Grazi");
        professor3.setUsuario("grazi");
        professor3.setSenha("123");
        professor3.setDisciplinas(List.of(
                Disciplina.disciplinaList.get(3), // Geografia
                Disciplina.disciplinaList.get(5)  // Química
        ));
        professores.add(professor3);

        Professor professor4 = new Professor();
        professor4.setNome("Bernardo");
        professor4.setUsuario("bernardo");
        professor4.setSenha("123");
        professor4.setDisciplinas(List.of(
                Disciplina.disciplinaList.get(6), // Biologia
                Disciplina.disciplinaList.get(7)  // Inglês
        ));
        professores.add(professor4);

        Professor professor5 = new Professor();
        professor5.setNome("Gustavo");
        professor5.setUsuario("gustavo");
        professor5.setSenha("123");
        professor5.setDisciplinas(List.of(
                Disciplina.disciplinaList.get(8), // Artes
                Disciplina.disciplinaList.get(9)  // Educação Física
        ));
        professores.add(professor5);
    }
}
