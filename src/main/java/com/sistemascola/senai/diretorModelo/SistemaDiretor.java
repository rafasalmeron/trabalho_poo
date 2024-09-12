package com.sistemascola.senai.diretorModelo;

import com.sistemascola.senai.alunoModelo.*;
import java.util.Scanner;

public class SistemaDiretor {
    public static void MenuDiretor() {
        Scanner sc = new Scanner(System.in);
        int option;

        do {
            System.out.println("""
                    
                      - Sistema Diretor -
                    
                    1 - Cadastrar Novo Aluno
                    2 - Atualizar Aluno
                    3 - Listar Alunos
                    4 - Deletar Alunos
                    0 - Sair
                    
                    """);
            option = sc.nextInt();
            switch (option){
                case 1 -> Cadastrar.cadastrarAluno();
                case 2 -> Atualizar.atualizarAluno();
                case 3 -> Listar.listarAlunos();
                case 4 -> Deletar.deletarAluno();
                case 0 -> System.out.println("Sair");
                default -> System.out.println("Opção inválida!");
            }
        }while(option != 0);
    }
}
