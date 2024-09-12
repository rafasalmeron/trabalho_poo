package com.sistemascola.senai.alunoModelo;

import com.sistemascola.senai.controlador.Login;
import com.sistemascola.senai.endereco.Endereco;
import com.sistemascola.senai.enumeradores.ModalidadeEnsino;
import com.sistemascola.senai.enumeradores.Role;
import com.sistemascola.senai.pessoaModelo.Pessoa;
import com.sistemascola.senai.turmaModelo.Turma;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Aluno extends Pessoa implements Login{
    private Turma turma;
    private LocalDateTime matriculadoEm;
    private ModalidadeEnsino modalidade;
    private String usuario;
    private String senha;
    private Role role = Role.ALUNO;
    public static List<Aluno> listaAlunos = new ArrayList<>();

    @Override
    public boolean acessoPermitido(String login, String senha) {
        return login.equals(this.getUsuario()) && senha.equals(this.getSenha());
    }

    @Override
    public Role getRole() {
        return role;
    }
}
