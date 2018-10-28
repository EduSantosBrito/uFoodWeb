package ufood.model;

import java.util.Observable;
import ufood.memento.ProdutoMemento;
import ufood.state.ProdutoState;

public class Produto extends Observable {

    private Long idProduto;
    private String nome;
    private Double preco;
    private Double tipo;
    private Long idEmpresa;
    private ProdutoState state;

    public Produto(Long idProduto, String nome, Double preco, Double tipo, Long idEmpresa) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
        this.idEmpresa = idEmpresa;
    }

    public Produto() {
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

    public ProdutoState getState() {
        return state;
    }

    public void setState(ProdutoState state) {
        this.state = state;
    }

    public void pedir() {
        state.pedir();
        setChanged();
        notifyObservers();
    }

    public void enviar() {
        state.enviar();
        setChanged();
        notifyObservers();
    }

    public void receber() {
        state.receber();
        setChanged();
        notifyObservers();
    }

    public void cancelar() {
        state.cancelar();
        setChanged();
        notifyObservers();
    }

    public ProdutoMemento saveToMemento() {
        return new ProdutoMemento(state);
    }

    public void restoreFromMemento(ProdutoMemento memento) {
        state = memento.getEstado();
    }
}
