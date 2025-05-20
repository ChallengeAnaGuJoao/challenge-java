package model;
import java.time.LocalDateTime;

public abstract class Consulta {
    private Long id;
    private LocalDateTime dataHora;
    private Profissional profissional;
    private Paciente paciente;

    public Consulta(Long id, LocalDateTime dataHora, Profissional profissional, Paciente paciente) {
        this.id = id;
        this.dataHora = dataHora;
        this.profissional = profissional;
        this.paciente = paciente;
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
}
