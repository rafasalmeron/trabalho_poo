package com.sistemascola.senai.professorModelo;

import com.sistemascola.senai.disciplinaModelo.Disciplina;
import com.sistemascola.senai.endereco.Endereco;
import com.sistemascola.senai.controlador.Login;
import com.sistemascola.senai.enumeradores.Role;
import com.sistemascola.senai.pessoaModelo.Pessoa;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class Professor extends Pessoa implements Login {
    private Role role = Role.PROFESSOR;
    private String usuario;
    private String senha;
    private List<Disciplina> disciplinas; // Professor pode ter mais de uma disciplina

    // Construtor com parâmetros
    public Professor(int id, String cpf, String nome, String telefone, String email, Endereco endereco, String matricula) {
        super(id, cpf, nome, telefone, email, endereco, matricula);
        this.disciplinas = new ArrayList<>(); // Inicializando a lista de disciplinas
    }

    // Construtor padrão
    public Professor() {
        this.disciplinas = new ArrayList<>(); // Inicializando a lista
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina); // Adiciona uma disciplina à lista
    }

    public void exibirDisciplinas() {
        if (disciplinas.isEmpty()) {
            System.out.println("Nenhuma disciplina atribuída.");
        } else {
            System.out.printf("Disciplinas do Professor %s: \n", this.getNome());
            for (Disciplina disciplina : disciplinas) {
                System.out.println("- " + disciplina.getNome());
            }
        }
    }

    @Override
    public boolean acessoPermitido(String login, String senha) {
        return login.equals(this.getUsuario()) && senha.equals(this.getSenha());
    }

    @Override
    public Role getRole() {
        return role;
    }

}
