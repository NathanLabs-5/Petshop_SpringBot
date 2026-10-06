package com.example.PetShop.entities;


import com.example.PetShop.interfaceS.Categorias;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

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

    @ManyToMany(mappedBy = "categoria")
    private List<Livro> livros;
}
