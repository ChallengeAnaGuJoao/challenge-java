package model;

import java.time.LocalDateTime;

public class TeleConsulta extends Consulta {
    private String linkAcesso;

    public TeleConsulta(Long id, LocalDateTime dataHora, Profissional profissional, Paciente paciente,
            String linkAcesso) {
        super(id, dataHora, profissional, paciente);
        this.linkAcesso = linkAcesso;
    }

    public String getLinkAcesso() {
        return linkAcesso;
    }

    public void setLinkAcesso(String linkAcesso) {
        this.linkAcesso = linkAcesso;
    }
}
