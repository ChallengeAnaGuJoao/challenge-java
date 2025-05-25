package model;

public class Prescricao {
    private Long id;
    private Medicamento medicamento;
    private String dosagem;
    private String frequencia;
    private String observacoes;

    public Prescricao(Long id, Medicamento medicamento, String dosagem, String frequencia, String observacoes) {
        this.id = id;
        this.medicamento = medicamento;
        this.dosagem = dosagem;
        this.frequencia = frequencia;
        this.observacoes = observacoes;
    }
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Medicamento getMedicamento() {
        return medicamento;
    }
    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
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

    @Override
    public String toString() {
        return "\nMedicamento: " + medicamento + " | Dosagem: " + dosagem + " | Frequência: " + frequencia + " | Observações: " + observacoes;
    }
}
