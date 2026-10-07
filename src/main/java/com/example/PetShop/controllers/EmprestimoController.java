package com.example.PetShop.controllers;


import com.example.PetShop.entities.Emprestimo;
import com.example.PetShop.services.EmprestimoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/emprestimos")
public class EmprestimoController {

    @Autowired
    private EmprestimoService emprestimoService;

    @PostMapping
    public Emprestimo cadastrar(@RequestBody Emprestimo emprestimo) {
        return emprestimoService.cadastrar(emprestimo);
    }

    @GetMapping
    public List<Emprestimo> listar() {
        return emprestimoService.listar();
    }

    @PutMapping("/{id}")
    public Emprestimo atualizar(@PathVariable Integer id, @RequestBody Emprestimo emprestimo) {
        return emprestimoService.atualizar(id, emprestimo);
    }
}
