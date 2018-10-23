/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufood.model;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Eduardo Santos
 */
public class Usuario implements Observer{
    
    private Long idUsuario;
    private String nome;
    private String senha;

    public Usuario(Long idUsuario, String nome, String senha) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.senha = senha;
    }

    public Usuario() {
    }
 
    public Long getIdUsuario() {
        return idUsuario;
    }

    public Usuario setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Usuario setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getSenha() {
        return senha;
    }

    public Usuario setSenha(String senha) {
        this.senha = senha;
        return this;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Foi mudado");
    }
}
