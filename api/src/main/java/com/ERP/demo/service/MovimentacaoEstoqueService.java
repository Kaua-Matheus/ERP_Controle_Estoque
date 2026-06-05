package com.ERP.demo.service;

import com.ERP.demo.entity.MovimentacaoEstoque;
import com.ERP.demo.repository.MovimentacaoEstoqueRepository;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class MovimentacaoEstoqueService {
  
    private final MovimentacaoEstoqueRepository repository;

    public MovimentacaoEstoqueService(MovimentacaoEstoqueRepository repository) {
        this.repository = repository;
    }


    // Cadastrar Movimentação
    public MovimentacaoEstoque setMovimentacaoEstoque(MovimentacaoEstoque movimentacao) {
        movimentacao.setData(LocalDateTime.now());

        return repository.save(movimentacao);
    }

}
