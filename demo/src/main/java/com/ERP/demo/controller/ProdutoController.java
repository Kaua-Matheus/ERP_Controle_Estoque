package com.ERP.demo.controller;

import com.ERP.demo.entity.Produto;
import com.ERP.demo.service.ProdutoService;

// Java Utils
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/produto")
public class ProdutoController {
    
    private final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    // Gets
    @GetMapping()
    public List<Produto> getProducts(){
        return service.getProducts();
    }

    @GetMapping("/{id}")
    public Optional<Produto> getProduct(@PathVariable Long id){
        return service.getProduct(id);
    }


    // Posts
    @PostMapping()
    public Produto setProduct(@RequestBody Produto produto){
        return service.setProduct(produto);
    }


    // Puts
    @PutMapping("/{id}")
    public Produto updateProduct(@PathVariable Long id, @RequestBody Produto produto){
        return service.updateProduct(id, produto);
    }

    @PutMapping("/{id}/ativo")
    public Boolean changeActiveProduct(@PathVariable Long id){
        return service.changeActiveProduct(id);
    }
}