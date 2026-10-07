package com.example.PetShop.controllers;


import com.example.PetShop.entities.Categoria;
import com.example.PetShop.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @PostMapping
    public Categoria cadastrar(@RequestBody Categoria categoria) {
        return categoriaService.salvarCategoria(categoria);
    }

    @GetMapping
    public List<Categoria> listar() {
        return categoriaService.listarCategorias();
    }
}
