package com.sistemascola.senai.alunoModelo;

import com.sistemascola.senai.global.GlobalScanner;

import static com.sistemascola.senai.alunoModelo.Aluno.listaAlunos;

public interface Atualizar {
    static void atualizarAluno(){
        int option;
        String cpfDigitado;

        System.out.println("""
                Atualizar Aluno
            
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
                do {
                    System.out.println("""
                                Este é o aluno que gostaria de Atualizar?
                                
                                Digite 1 para ALTERAR o NOME
                                Digite 2 para ALTERAR a MATRICULA
                                Digite 3 para ALTERAR o CPF
                                Digite 0 para SAIR
                                
                                """);

                    option = GlobalScanner.scan.nextInt();

                    switch (option) {
                        case 1 -> {
                            String nome = GlobalScanner.scan.nextLine();
                            for (int i = 0; i < listaAlunos.size(); i++) {
                                listaAlunos.get(i).setNome(nome);
                            }
                        }
                        case 2 -> {
                            String matricula = GlobalScanner.scan.nextLine();
                            for (int i = 0; i < listaAlunos.size(); i++) {
                                listaAlunos.get(i).setMatricula(matricula);
                            }
                        }
                        case 3 -> {
                            String cpf = GlobalScanner.scan.nextLine();
                            for (int i = 0; i < listaAlunos.size(); i++) {
                                listaAlunos.get(i).setCpf(cpf);
                            }
                        }
                        case 0 -> System.out.println("...Voltando ao Menu anterior...");
                    }
                }while(option == 0);
            }
        }
    }
}
