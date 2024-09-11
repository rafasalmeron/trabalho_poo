package com.sistemascola.senai;
import com.sistemascola.senai.disciplinaModelo.Disciplina;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import static com.sistemascola.senai.diretorModelo.SistemaDiretor.MenuDiretor;

@SpringBootApplication
public class MenuApplication {

	public static void main(String[] args) {
		SpringApplication.run(MenuApplication.class, args);
		Disciplina disc = new Disciplina("Test", "0001");

	MenuDiretor(args);
    }
}


