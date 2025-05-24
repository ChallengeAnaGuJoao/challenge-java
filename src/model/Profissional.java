package model;

import java.util.List;

public class Profissional {
    private Long id;
    private String nome;
    private String tipo;
    private List<Especialidade> especialidades;
    
    public Profissional(Long id, String nome, String tipo, List<Especialidade> especialidades) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.especialidades = especialidades;
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
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public List<Especialidade> getEspecialidades() {
        return especialidades;
    }
    public void setEspecialidades(List<Especialidade> especialidades) {
        this.especialidades = especialidades;
    }

    @Override
    public String toString() {
        return nome + " (" + tipo + ") - Especialidades: " + especialidades.get(0);
    }
}
