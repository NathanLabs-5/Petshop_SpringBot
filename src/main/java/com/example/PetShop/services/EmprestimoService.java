package com.example.PetShop.services;

import com.example.PetShop.entities.Emprestimo;
import com.example.PetShop.repositories.EmprestimoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmprestimoService {

    @Autowired
    private EmprestimoRepository emprestimoRepository;

    public Emprestimo cadastrar(Emprestimo emprestimo) {
        return emprestimoRepository.save(emprestimo);
    }

    public List<Emprestimo> listar() {
        return emprestimoRepository.findAll();
    }

    public Emprestimo atualizar(Integer id, Emprestimo dados) {

        Emprestimo emprestimo = emprestimoRepository.findById(id).get();
        emprestimo.setAtivo(dados.getAtivo());
        return emprestimoRepository.save(emprestimo);
    }

    public void excluir(Integer id) {
        emprestimoRepository.deleteById(id);
    }
}