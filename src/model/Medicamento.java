package model;

public class Medicamento {
    private Long id;
    private String nome;
    private String principioAtivo;

    public Medicamento(Long id, String nome, String principioAtivo) {
        this.id = id;
        this.nome = nome;
        this.principioAtivo = principioAtivo;
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

    public String getPrincipioAtivo() {
        return principioAtivo;
    }

    public void setPrincipioAtivo(String principioAtivo) {
        this.principioAtivo = principioAtivo;
    }

    @Override
    public String toString() {
        return nome + " - Princípio ativo: " + principioAtivo;
    }
}
