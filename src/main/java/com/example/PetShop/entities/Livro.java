package com.example.PetShop.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "livros")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLivro;

    @Column(nullable = false)
    private String nome;
    //id_usuario/editora...

    @ManyToMany
}
