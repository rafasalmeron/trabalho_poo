package com.sistemascola.senai;
import com.sistemascola.senai.alunoModelo.Aluno;
import com.sistemascola.senai.controlador.Login;
import com.sistemascola.senai.controlador.LoginController;
import com.sistemascola.senai.diretorModelo.Diretor;
import com.sistemascola.senai.disciplinaModelo.Disciplina;
import com.sistemascola.senai.enumeradores.Role;
import com.sistemascola.senai.global.GlobalScanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

import static com.sistemascola.senai.diretorModelo.SistemaDiretor.MenuDiretor;

@SpringBootApplication
public class SenaiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SenaiApplication.class, args);
		int opt;
		List<Login> usuarios = new ArrayList<>();
		Diretor diretor = new Diretor();
		diretor.setUsuario("admin");
		diretor.setSenha("123");
		usuarios.add(diretor);

		do{
			System.out.println("""
					Menu Principal
					
					Digite 1 para Logar no sistema
					Digite 2 para SAIR
					
					""");
			opt = GlobalScanner.scan.nextInt();
			switch (opt){
				case 1 -> {
					System.out.println("""
				    Login SENAI
				
				    (login: admin           )
				    (senha: 123             )
				    (Para o primeiro acesso*)
				
				Digite seu login:
				""");
					String user = GlobalScanner.scan.nextLine();
					System.out.println("Digite sua senha:");
					String pass = GlobalScanner.scan.nextLine();

					LoginController loginController = new LoginController();
					Role role = loginController.login(user,pass,usuarios);

					if(role == Role.DIRETOR) {
						MenuDiretor(args);
					}
					if(role == Role.ALUNO){
						System.out.println("Menu do Aluno");
					}
					if(role == Role.PROFESSOR){
						System.out.println("Menu do Professor");
					}
				}
				case 2 -> System.out.println("Obrigado por utilizar nosso sistema");
			}
		}while(opt != 2);
    }
}


