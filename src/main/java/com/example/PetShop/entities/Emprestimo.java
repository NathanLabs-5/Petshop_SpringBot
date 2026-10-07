package com.example.PetShop.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "emprestimos")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Emprestimo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEmprestimo;
    private Boolean ativo;

    @ManyToOne
    @JoinColumn(name = "livro_id")
    private Livro livro;
}
