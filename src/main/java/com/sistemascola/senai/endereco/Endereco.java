package com.sistemascola.senai.endereco;

import com.sistemascola.senai.enumeradores.UnidadeFederal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    private int id;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private UnidadeFederal unidade;
    private String cep;
}



