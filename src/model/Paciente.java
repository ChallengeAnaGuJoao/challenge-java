package model;

import java.util.List;

public class Paciente {
    private Long id;
    private String nome;
    private String cpf;
    private List<Endereco> enderecos;
    
    public Paciente(Long id, String nome, String cpf, List<Endereco> enderecos) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.enderecos = enderecos;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public List<Endereco> getEnderecos() {
        return enderecos;
    }
    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    @Override
    public String toString() {
        return nome + " (CPF: " + cpf + ") - Endereços: " + enderecos;
    }
}
