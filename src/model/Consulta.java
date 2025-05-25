package model;
import java.time.LocalDateTime;

public abstract class Consulta {
    protected Long id;
    protected LocalDateTime dataHora;
    protected Profissional profissional;
    protected Paciente paciente;
    protected Receita receita;

    public Consulta(Long id, LocalDateTime dataHora, Profissional profissional, Paciente paciente,
            Receita receita) {
        this.id = id;
        this.dataHora = dataHora;
        this.profissional = profissional;
        this.paciente = paciente;
        this.receita = receita;
    }
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public LocalDateTime getDataHora() {
        return dataHora;
    }
    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
    public Profissional getProfissional() {
        return profissional;
    }
    public void setProfissional(Profissional profissional) {
        this.profissional = profissional;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public Receita getReceita() {
        return receita;
    }
    public void setReceita(Receita receita) {
        this.receita = receita;
    }

    public abstract void realizarConsulta();

    @Override
    public String toString() {
        return "Paciente: " + paciente + "\nProfissional: " + profissional + "\nHorário: "+ dataHora +"\n*** RECEITA ***: " + receita;
    }
}
