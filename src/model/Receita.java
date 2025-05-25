package model;

import java.util.List;

public class Receita {
    private Long id;
    private Paciente paciente;
    private Profissional profissional;
    private List<Prescricao> prescricoes;
    private String observacoes;
    
    public Receita(Long id, Paciente paciente, Profissional profissional, List<Prescricao> prescricoes,
            String observacoes) {
        this.id = id;
        this.paciente = paciente;
        this.profissional = profissional;
        this.prescricoes = prescricoes;
        this.observacoes = observacoes;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public Profissional getProfissional() {
        return profissional;
    }
    public void setProfissional(Profissional profissional) {
        this.profissional = profissional;
    }
    public List<Prescricao> getPrescricoes() {
        return prescricoes;
    }
    public void setPrescricoes(List<Prescricao> prescricoes) {
        this.prescricoes = prescricoes;
    }
    public String getObservacoes() {
        return observacoes;
    }
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public void adicionarPrescricao(Prescricao prescricao) {
        prescricoes.add(prescricao);
    }
    @Override
    public String toString() {
        return "\nPrescrições: " + prescricoes + "\nObservações: " + observacoes;
    }
}
