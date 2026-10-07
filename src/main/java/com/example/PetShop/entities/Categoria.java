package com.example.PetShop.entities;


import com.example.PetShop.interfaceS.Categorias;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "categorias")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCategoria;

    @Enumerated(EnumType.STRING)
    private Categorias nomeCategoria;

    @JsonIgnore
    @ManyToMany(mappedBy = "categorias")
    private List<Livro> livros = new ArrayList<>();
}
