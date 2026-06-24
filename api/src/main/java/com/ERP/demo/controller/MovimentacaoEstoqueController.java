package com.ERP.demo.controller;

import com.ERP.demo.entity.MovimentacaoEstoque;
import com.ERP.demo.service.MovimentacaoEstoqueService;

// Java Utils
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movimentacao")
public class MovimentacaoEstoqueController {
    
    private final MovimentacaoEstoqueService service;

    public MovimentacaoEstoqueController(MovimentacaoEstoqueService service) {
        this.service = service;
    }


    // Gets
    @GetMapping()
    public List<MovimentacaoEstoque> getMovimentacoes() {
        return service.getMovimentacoes();
    }


    // Posts
    @PostMapping()
    public MovimentacaoEstoque setMovimentacaoEstoque(@RequestBody MovimentacaoEstoque movimentacaoEstoque) {
        return service.setMovimentacaoEstoque(movimentacaoEstoque);
    }
}
