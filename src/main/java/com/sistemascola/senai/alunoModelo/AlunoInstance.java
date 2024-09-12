package com.sistemascola.senai.alunoModelo;

import java.time.LocalDateTime;

public interface AlunoInstance {
    static void alunoInstance() {

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Joaquin");
        aluno1.setId(1);
        aluno1.setCpf("1234567890");
        aluno1.setMatricula("123");
        aluno1.setUsuario("joaquin");
        aluno1.setSenha("123");
        aluno1.setMatriculadoEm(LocalDateTime.now());
        Aluno.listaAlunos.add(aluno1);


        Aluno aluno2 = new Aluno();
        aluno2.setNome("Severino");
        aluno2.setId(2);
        aluno2.setCpf("11321548789564");
        aluno2.setMatricula("124");
        aluno2.setUsuario("severo");
        aluno2.setSenha("123");
        aluno2.setMatriculadoEm(LocalDateTime.now());
        Aluno.listaAlunos.add(aluno2);

        Aluno aluno3 = new Aluno();
        aluno3.setNome("Eduarda");
        aluno3.setId(3);
        aluno3.setCpf("123asd0");
        aluno3.setMatricula("125");
        aluno3.setUsuario("duda");
        aluno3.setSenha("123");
        aluno3.setMatriculadoEm(LocalDateTime.now());
        Aluno.listaAlunos.add(aluno3);

        Aluno aluno4 = new Aluno();
        aluno4.setNome("Helena");
        aluno4.setId(4);
        aluno4.setCpf("123zasds67890");
        aluno4.setMatricula("126");
        aluno4.setUsuario("helena");
        aluno4.setSenha("123");
        aluno4.setMatriculadoEm(LocalDateTime.now());
        Aluno.listaAlunos.add(aluno4);

        Aluno aluno5 = new Aluno();
        aluno5.setNome("Rafael");
        aluno5.setId(5);
        aluno5.setCpf("1asd4567890");
        aluno5.setMatricula("127");
        aluno5.setUsuario("rafa");
        aluno5.setSenha("123");
        aluno5.setMatriculadoEm(LocalDateTime.now());
        Aluno.listaAlunos.add(aluno5);

        Aluno aluno6 = new Aluno();
        aluno6.setNome("Harry Potter");
        aluno6.setId(6);
        aluno6.setCpf("1234fgh90");
        aluno6.setMatricula("128");
        aluno6.setUsuario("potter");
        aluno6.setSenha("123");
        aluno6.setMatriculadoEm(LocalDateTime.now());
        Aluno.listaAlunos.add(aluno6);

        Aluno aluno7 = new Aluno();
        aluno7.setNome("Yoda");
        aluno7.setId(7);
        aluno7.setCpf("123456sads0");
        aluno7.setMatricula("129");
        aluno7.setUsuario("yoda");
        aluno7.setSenha("123");
        aluno7.setMatriculadoEm(LocalDateTime.now());
        Aluno.listaAlunos.add(aluno7);

        Aluno aluno8 = new Aluno();
        aluno8.setNome("Luke Skywalker");
        aluno8.setId(8);
        aluno8.setCpf("1234567fd0");
        aluno8.setMatricula("130");
        aluno8.setUsuario("luke");
        aluno8.setSenha("123");
        aluno8.setMatriculadoEm(LocalDateTime.now());
        Aluno.listaAlunos.add(aluno8);
    }
}
