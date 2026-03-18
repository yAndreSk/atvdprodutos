package com.example.produtos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.produtos.model.Produto;
import com.example.produtos.repository.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public Produto salvar(Produto produto) {
        return repository.save(produto);
    }

    public List<Produto> listarTodos() {
        return repository.findAll();
    }

    public Produto atualizar(Long id, Produto produto) {

        Produto p = repository.findById(id).orElse(null);

        if (p != null) {
            p.setNome(produto.getNome());
            p.setPreco(produto.getPreco());
            p.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque());
            p.setStatus(produto.getStatus());

            return repository.save(p);
        }

        return null;
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}