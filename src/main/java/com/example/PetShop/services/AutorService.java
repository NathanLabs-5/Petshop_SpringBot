package com.example.PetShop.services;

import com.example.PetShop.entities.Autor;
import com.example.PetShop.repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public Autor cadastrar(Autor autor) {
        return autorRepository.save(autor);
    }

    public List<Autor> listar() {
        return autorRepository.findAll();
    }

    public Autor buscarPorId(Integer id) {
        return autorRepository.findById(id).get();
    }

    public Autor atualizar(Integer id, Autor autor) {

        Autor autorExistente = autorRepository.findById(id).get();

        autorExistente.setNome(autor.getNome());

        return autorRepository.save(autorExistente);
    }

    public void excluir(Integer id) {
        autorRepository.deleteById(id);
    }
}