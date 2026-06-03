package com.ERP.demo.controller;

import com.ERP.demo.entity.Produto;
import com.ERP.demo.service.ProdutoService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    
    private final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    @PostMapping
    public Produto cadastrar(@RequestBody Produto produto){
        return service.cadastrar(produto);
    }
}
