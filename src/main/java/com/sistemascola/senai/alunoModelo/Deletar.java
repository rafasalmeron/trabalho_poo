package com.sistemascola.senai.alunoModelo;

import com.sistemascola.senai.global.GlobalScanner;

import static com.sistemascola.senai.alunoModelo.Aluno.listaAlunos;

public interface Deletar {
    static void deletarAluno(){
        int option;
        String cpfDigitado;

        System.out.println("""
                Deletar Aluno
            
            Digite o CPF do Aluno:
            """);
        cpfDigitado = GlobalScanner.scan.nextLine();
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

                option = GlobalScanner.scan.nextInt();

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
