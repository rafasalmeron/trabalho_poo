package com.sistemascola.senai.diretorModelo;

import com.sistemascola.senai.pessoaModelo.Pessoa;
import com.sistemascola.senai.controlador.Login;
import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter @Setter
public class Diretor extends Pessoa implements Login {
    private String usuario;
    private String senha;

    @Override
    public boolean acessoPermitido(String login, String senha) {
        if (login.equals(getUsuario()) && senha.equals(getSenha())) {
            return true;
        }
        return false;
    }
}
