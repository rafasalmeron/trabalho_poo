package com.sistemascola.senai.professorModelo;

import com.sistemascola.senai.alunoModelo.Atualizar;
import com.sistemascola.senai.alunoModelo.Cadastrar;
import com.sistemascola.senai.alunoModelo.Deletar;
import com.sistemascola.senai.alunoModelo.Listar;
import java.util.Scanner;

public class SistemaProfessor {
    public static void menuProfessor(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;

        do {
            System.out.println("""
                
                  - Sistema Professor -
                
                1 - Lançar Nota
                2 - Consultar Alunos
                3 - Listar Alunos e suas notas
                0 - Sair
                
                """);
            option = sc.nextInt();
            switch (option){
                case 1 -> System.out.println("teste");
                case 2 -> ConsultarAlunos.consultarAlunos();
                case 3 -> Listar.listarAlunos();
                case 4 -> Deletar.deletarAluno();
                case 0 -> System.out.println("Sair");
            }
        }while(option != 0);
    }
}

