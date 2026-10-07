package com.example.PetShop.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Livro_schema {
    private String nome;

    private List<Integer> autores;

    private List<Integer> categorias;
}
