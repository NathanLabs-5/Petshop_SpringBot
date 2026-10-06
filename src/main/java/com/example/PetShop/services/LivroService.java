package com.example.PetShop.services;


import com.example.PetShop.dto.livro_schema;
import com.example.PetShop.entities.Autor;
import com.example.PetShop.entities.Categoria;
import com.example.PetShop.entities.Livro;
import com.example.PetShop.repositories.AutorRepository;
import com.example.PetShop.repositories.CategoriaRepository;
import com.example.PetShop.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    @Autowired
    private AutorRepository autorRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Livro cadastrar(livro_schema dados) {

        Livro livro = new Livro();

        livro.setNome(dados.getNome());

        List<Autor> autores = new ArrayList<>();

        for (Integer id : dados.getAutores()) {
            Autor autor = autorRepository.findById(id).get();
            autores.add(autor);
        }

        livro.setAutores(autores);

        List<Categoria> categorias = new ArrayList<>();

        for (Integer id : dados.getCategorias()) {
            Categoria categoria = categoriaRepository.findById(id).get();
            categorias.add(categoria);
        }

        livro.setCategorias(categorias);

        return livroRepository.save(livro);
    }
}