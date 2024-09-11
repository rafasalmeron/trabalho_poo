package com.sistemascola.senai.diretorModelo;

import com.sistemascola.senai.enumeradores.Role;
import com.sistemascola.senai.pessoaModelo.Pessoa;
import com.sistemascola.senai.controlador.Login;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Diretor extends Pessoa implements Login {
    private String usuario;
    private String senha;
    private Role role = Role.DIRETOR;

    @Override
    public boolean acessoPermitido(String login, String senha) {
        return login.equals(this.getUsuario()) && senha.equals(this.getSenha());
    }

    @Override
    public Role getRole() {
        return role;
    }
}
