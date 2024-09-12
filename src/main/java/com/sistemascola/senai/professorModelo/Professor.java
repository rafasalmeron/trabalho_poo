package com.sistemascola.senai.professorModelo;

import com.sistemascola.senai.disciplinaModelo.Disciplina;
import com.sistemascola.senai.endereco.Endereco;
import com.sistemascola.senai.controlador.Login;
import com.sistemascola.senai.enumeradores.Role;
import com.sistemascola.senai.pessoaModelo.Pessoa;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Professor extends Pessoa implements Login {
    private Role role = Role.PROFESSOR;
    private String usuario;
    private String senha;
    public List<Disciplina> disciplinas = new ArrayList<>();
    public static List<Professor> professores = new ArrayList<>();

    @Override
    public boolean acessoPermitido(String login, String senha) {
        return login.equals(this.getUsuario()) && senha.equals(this.getSenha());
    }

    @Override
    public Role getRole() {
        return role;
    }
}
