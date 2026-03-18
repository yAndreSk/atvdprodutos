package com.example.produtos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.produtos.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}