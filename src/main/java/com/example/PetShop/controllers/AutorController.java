package com.example.PetShop.controllers;


import com.example.PetShop.entities.Autor;
import com.example.PetShop.services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/autores")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @PostMapping
    public Autor cadastrar(@RequestBody Autor autor) {
        return autorService.cadastrar(autor);
    }

    @GetMapping
    public List<Autor> listar() {
        return autorService.listar();
    }

    @PutMapping("/{id}")
    public Autor atualizar(@PathVariable Integer id, @RequestBody Autor autor) {
        return autorService.atualizar(id, autor);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Integer id) {
        autorService.excluir(id);
    }

}
