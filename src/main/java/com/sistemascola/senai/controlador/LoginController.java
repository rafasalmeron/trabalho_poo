package com.sistemascola.senai.controlador;

import com.sistemascola.senai.enumeradores.Role;
import java.util.List;

public class LoginController {
    public Role login(String usuario, String senha, List<Login> usuarios) {
        for (Login user : usuarios) {
            if(user.acessoPermitido(usuario, senha)) {
                return user.getRole();
            }
        }
        return null;
    }
}
