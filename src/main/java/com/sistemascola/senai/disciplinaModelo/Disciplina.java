package com.sistemascola.senai.disciplinaModelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Disciplina {
    private int id;
    private String nome;
    public static List<Disciplina> disciplinaList= new ArrayList<>();
}


