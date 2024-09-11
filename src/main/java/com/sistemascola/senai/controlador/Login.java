package com.sistemascola.senai.controlador;

import com.sistemascola.senai.enumeradores.Role;

public interface Login {
    boolean acessoPermitido(String login, String senha);
    Role getRole();
}
