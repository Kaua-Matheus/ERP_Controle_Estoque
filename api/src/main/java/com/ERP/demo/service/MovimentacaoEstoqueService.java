package com.ERP.demo.service;

import com.ERP.demo.entity.MovimentacaoEstoque;
import com.ERP.demo.repository.MovimentacaoEstoqueRepository;

// Java Imports
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MovimentacaoEstoqueService {
  
    private final MovimentacaoEstoqueRepository repository;

    public MovimentacaoEstoqueService(MovimentacaoEstoqueRepository repository) {
        this.repository = repository;
    }


    // Listar movimentações
    public List<MovimentacaoEstoque> getMovimentacoes() {
        return repository.findAll();
    }


    // Cadastrar Movimentação
    public MovimentacaoEstoque setMovimentacaoEstoque(MovimentacaoEstoque movimentacao) {
        movimentacao.setData(LocalDateTime.now());

        return repository.save(movimentacao);
    }

}
