package com.ERP.demo.service;

import com.ERP.demo.entity.Produto;
import com.ERP.demo.repository.ProdutoRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    
    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }


    // Retorna o produto requerido por id
    public Optional<Produto> getProduct(Long id) {
        Optional<Produto> product = 
            repository.findById(id);

        return product;
    }

    // Retorna todos os produtos em uma lista
    public List<Produto> getProducts(){
        return repository.findAll();
    }


    // Cadastrar produto
    public Produto setProduct(Produto produto){
        produto.setEstoque(0);
        produto.setAtivo(true);

        return repository.save(produto);
    }


    // Editar produto
    public Produto updateProduct(Long id, Produto produto) {
        Produto saved_Produto = repository.getReferenceById(id);

        saved_Produto.setNome(produto.getNome());
        saved_Produto.setPreco(produto.getPreco());

        return repository.save(saved_Produto);
    }


    // Ativar / Inativar
    public Boolean changeActiveProduct(Long id) {
        Produto produto = 
            repository.findById(id)
                .orElseThrow();

        produto.setAtivo(!produto.getAtivado());

        repository.save(produto);

        // Retorna novo status
        return produto.getAtivado();
    }

}
