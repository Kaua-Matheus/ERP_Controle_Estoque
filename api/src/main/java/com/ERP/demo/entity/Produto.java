package com.ERP.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "produtos")
public class Produto {
    
    @Id
    @GeneratedValue(strategy = 
        GenerationType.IDENTITY)

        
    // --- Vars ---
    private Long id;

    private String nome;

    private Double preco;

    private Integer estoque;

    private Boolean ativo;


    // --- Funcs Gets ---
    public Produto() {

    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public Boolean getAtivo() {
        return ativo;
    }


    // --- Funcs Sets ---
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}
