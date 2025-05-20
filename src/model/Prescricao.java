package model;

public class Prescricao {
    private Medicamento medicamento;
    private Receita receita;
    private String dosagem;
    private String frequencia;
    private String observacoes;

    public Prescricao(Medicamento medicamento, Receita receita, String dosagem, String frequencia, String observacoes) {
        this.medicamento = medicamento;
        this.receita = receita;
        this.dosagem = dosagem;
        this.frequencia = frequencia;
        this.observacoes = observacoes;
    }
    
    public Medicamento getMedicamento() {
        return medicamento;
    }
    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }
    public Receita getReceita() {
        return receita;
    }
    public void setReceita(Receita receita) {
        this.receita = receita;
    }
    public String getDosagem() {
        return dosagem;
    }
    public void setDosagem(String dosagem) {
        this.dosagem = dosagem;
    }
    public String getFrequencia() {
        return frequencia;
    }
    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }
    public String getObservacoes() {
        return observacoes;
    }
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}
