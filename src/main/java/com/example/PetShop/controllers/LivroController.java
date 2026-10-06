package com.example.PetShop.controllers;


import com.example.PetShop.dto.livro_schema;
import com.example.PetShop.entities.Livro;
import com.example.PetShop.services.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @PostMapping
    public Livro cadastrar(@RequestBody livro_schema dados) {
        return livroService.cadastrar(dados);
    }
}
