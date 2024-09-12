package com.sistemascola.senai.pessoaModelo;

import com.sistemascola.senai.endereco.Endereco;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pessoa {
    private int id;
    private String cpf;
    private String nome;
    private String telefone;
    private String email;
    private Endereco endereco;
    private String matricula;
}
