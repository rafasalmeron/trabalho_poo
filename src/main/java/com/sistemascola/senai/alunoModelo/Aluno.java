package com.sistemascola.senai.alunoModelo;

import com.sistemascola.senai.controlador.Login;
import com.sistemascola.senai.endereco.Endereco;
import com.sistemascola.senai.enumeradores.ModalidadeEnsino;
import com.sistemascola.senai.pessoaModelo.Pessoa;
import com.sistemascola.senai.turmaModelo.Turma;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Getter @Setter
public class Aluno extends Pessoa implements Login{
    private Turma turma;
    private LocalDateTime matriculadoEm;
    private ModalidadeEnsino modalidade;
    private String usuario;
    private String senha;
    public static List<Aluno> listaAlunos = new ArrayList<>();

    @Override
    public boolean acessoPermitido(String login, String senha) {
        if (login.equals(getUsuario()) && senha.equals(getSenha())) {
            return true;
        }
        return false;
    }

    public Aluno(){
    }

    public Aluno(
                 int id,
                 String cpf,
                 String nome,
                 String telefone,
                 String email,
                 Endereco endereco,
                 String matricula,
                 Turma turma,
                 ModalidadeEnsino modalidade) {
        super(
                id,
                cpf,
                nome,
                telefone,
                email,
                endereco,
                matricula
        );
        this.turma = turma;
        this.modalidade = modalidade;
        this.matriculadoEm = LocalDateTime.now();
    }

    public String dataMatricula() {
        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return today.format(customFormatter);
    }


}
