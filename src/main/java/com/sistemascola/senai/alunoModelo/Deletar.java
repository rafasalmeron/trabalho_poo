package com.sistemascola.senai.alunoModelo;

import java.util.Scanner;
import static com.sistemascola.senai.alunoModelo.Aluno.listaAlunos;

public interface Deletar {
    static void deletarAluno(){
        Scanner scanLocal  = new Scanner(System.in);
        int option;
        String cpfDigitado;

        System.out.println("""
                Deletar Aluno
            
            Digite o CPF do Aluno:
            """);
        cpfDigitado = scanLocal.nextLine();
        if (listaAlunos.isEmpty()) {
            System.out.println("Nenhum Aluno registrado. Lista Vazia...");
        } else {
            int verificador = 0;
            for (Aluno a : listaAlunos) {
                if (a.getCpf().equals(cpfDigitado)) {
                    System.out.printf("""
                            ° Nome: %s
                            ° CPF: %s
                            ° Matricula: %s
                            """, a.getNome(), a.getCpf(), a.getMatricula()
                    );
                    verificador = 1;
                    break;
                }
            }
            if (verificador == 0) {
                System.out.println("CPF não encontrado.");
            }
            if (verificador == 1) {
                System.out.println("""
                Este é o aluno que gostaria de deletar?
                
                Digite 1 para SIM
                Digite 2 para NÃO
                
                """);

                option = scanLocal.nextInt();

                switch (option) {
                    case 1 -> {
                        for (int i = 0; i < listaAlunos.size(); i++) {
                            if (listaAlunos.get(i).getCpf().equals(cpfDigitado)) {
                                listaAlunos.remove(i);
                                System.out.println("Aluno removido com sucesso!");
                                break;
                            }
                        }
                    }
                    case 2 -> {
                        System.out.println("...Voltando ao menu anterior... \n");
                    }
                }
            }
        }
    }
}
