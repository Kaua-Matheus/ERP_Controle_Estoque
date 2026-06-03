package com.ERP.demo.service;

import com.ERP.demo.entity.Produto;
import com.ERP.demo.repository.ProdutoRepository;

import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    
    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public Produto cadastrar(Produto produto){
        produto.setEstoque(0);

        return repository.save(produto);
    }
}
