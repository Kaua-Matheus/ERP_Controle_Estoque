package com.ERP.demo.entity;

import java.time.LocalDateTime;

// import com.ERP.demo.entity.Produto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

enum Tipo {
    ENTRADA,
    SAIDA
}

@Entity
@Table(name = "movimentacao_estoque")
public class MovimentacaoEstoque {
    
    @Id
    @GeneratedValue(strategy = 
        GenerationType.IDENTITY)
    
    // --- Vars ---
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "produto_id")
    private Produto produto;

    private Integer quantidade;

    @Enumerated(EnumType.STRING)
    private Tipo tipo;

    private LocalDateTime data;


    // --- Funcs Gets ---
    public MovimentacaoEstoque(){

    }

    public Long getId() {
        return id;
    }

    public Produto getProduto() {
        return produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Tipo getTipoMovimentacao() {
        return tipo;
    }
    

    public LocalDateTime getData() {
        return data;
    }


    // --- Funcs Sets ---
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public void setTipoMovimentacao(Tipo tipo) {
        this.tipo = tipo;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

}
