package ufood.model;

import java.util.Observable;


public class Produto extends Observable {
    
    private Long idProduto;
    private String nome;
    private Double preco;
    private Double tipo;
    private Long idEmpresa;

    public Produto(Long idProduto, String nome, Double preco, Double tipo, Long idEmpresa) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
        this.idEmpresa = idEmpresa;
    }

    public Long getIdProduto() {
        return idProduto;
    }

    public Produto setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Produto setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Double getPreco() {
        return preco;
    }

    public Produto setPreco(Double preco) {
        this.preco = preco;
        return this;
    }

    public Double getTipo() {
        return tipo;
    }

    public Produto setTipo(Double tipo) {
        this.tipo = tipo;
        return this;
    }

    public Long getIdEmpresa() {
        return idEmpresa;
    }

    public Produto setIdEmpresa(Long idEmpresa) {
        this.idEmpresa = idEmpresa;
        return this;
    }
    
    
}
