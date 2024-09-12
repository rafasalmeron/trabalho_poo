package com.sistemascola.senai;

import com.sistemascola.senai.alunoModelo.Aluno;
import com.sistemascola.senai.alunoModelo.AlunoInstance;
import com.sistemascola.senai.professorModelo.ConsultarAlunos;
import com.sistemascola.senai.professorModelo.Professor;
import com.sistemascola.senai.professorModelo.ProfessorInstance;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.sistemascola.senai.controlador.Login;
import com.sistemascola.senai.controlador.LoginController;
import com.sistemascola.senai.diretorModelo.Diretor;
import com.sistemascola.senai.enumeradores.Role;
import org.springframework.boot.SpringApplication;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.sistemascola.senai.diretorModelo.SistemaDiretor.MenuDiretor;
import static com.sistemascola.senai.professorModelo.SistemaProfessor.menuProfessor;

@SpringBootApplication
public class SenaiApplication {
	public static void entrada(String[] args) {
		Scanner scanLocal = new Scanner(System.in);

		List<Login> usuarios = new ArrayList<>();
        usuarios.addAll(Aluno.listaAlunos);
		usuarios.addAll(Professor.professores);

		Diretor diretor = new Diretor();
		diretor.setUsuario("admin");
		diretor.setSenha("123");
		usuarios.add(diretor);

		System.out.println("""
				    Login SENAI
				
				    (      login: admin      )
				    (      senha: 123        )
				    (*Para o primeiro acesso*)
				""");

		System.out.println("Digite seu login:");
		String user = scanLocal.nextLine();

		System.out.println("Digite sua senha:");
		String pass = scanLocal.nextLine();

		LoginController loginController = new LoginController();
		Role role = loginController.login(user, pass, usuarios);

		if(role == Role.DIRETOR) {
			MenuDiretor(args);
		}
		if(role == Role.ALUNO){
			System.out.println("Menu do Aluno");
		}
		if(role == Role.PROFESSOR){
			menuProfessor(args);
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(SenaiApplication.class, args);
		ProfessorInstance.professorInstance();
		AlunoInstance.alunoInstance();
		int opt;
		do{
			System.out.println("""
					     Menu Principal

					Digite 1 para Logar no sistema
					Digite 2 para SAIR

					""");
			Scanner scanLocal = new Scanner(System.in);
			opt = scanLocal.nextInt();
			switch (opt){
				case 1 -> entrada(args);
				case 2 -> System.out.println("Obrigado por utilizar nosso sistema");
			}
		}while(opt != 2);
    }
}