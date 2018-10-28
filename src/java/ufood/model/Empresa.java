package ufood.model;

public class Empresa {

    private Long idEmpresa;
    private String nome;

    public Empresa(Long idEmpresa, String nome) {
        this.idEmpresa = idEmpresa;
        this.nome = nome;
    }

    public Empresa() {
    }

    public Long getIdEmpresa() {
        return idEmpresa;
    }

    public Empresa setIdEmpresa(Long idEmpresa) {
        this.idEmpresa = idEmpresa;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
