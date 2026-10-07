package com.example.PetShop.controllers;


import com.example.PetShop.dto.Livro_schema;
import com.example.PetShop.entities.Livro;
import com.example.PetShop.services.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @PostMapping
    public Livro cadastrar(@RequestBody Livro_schema dados) {
        return livroService.cadastrar(dados);
    }

    @GetMapping
    public List<Livro> listar() {
        return livroService.listar();
    }
}
