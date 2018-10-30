/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufood.model;

import ufood.template.TipoCompra;

/**
 *
 * @author ismael.pereira
 */
public class Compra {
    private Long idCompra;
    private Long idUsuario;
    private Long idProduto;
    private TipoCompra tipoCompra;

    public Compra(Long idCompra, Long idUsuario, Long idProduto, TipoCompra tipoCompra) {
        this.idCompra = idCompra;
        this.idUsuario = idUsuario;
        this.idProduto = idProduto;
        this.tipoCompra = tipoCompra;
    }
    
    public Compra(){
    }

    public Long getIdCompra() {
        return idCompra;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public Long getIdProduto() {
        return idProduto;
    }

    public Compra setIdCompra(Long idCompra) {
        this.idCompra = idCompra;
        return this;
    }

    public Compra setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
        return this;
    }

    public Compra setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
        return this;
    }

    public TipoCompra getTipoCompra() {
        return tipoCompra;
    }

    public Compra setTipoCompra(TipoCompra tipoCompra) {
        this.tipoCompra = tipoCompra;
        return this;
    }
    
    
    
    
    
}
