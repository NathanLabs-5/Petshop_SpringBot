package com.example.PetShop.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "autores")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAutor;
    private String nome;

    @ManyToMany(mappedBy = "autores")
    private List<Livro> livros = new ArrayList<>();

}
