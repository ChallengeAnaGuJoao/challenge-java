package model;

import java.time.LocalDateTime;

public class TeleConsulta extends Consulta {
    private String linkAcesso;

    public TeleConsulta(Long id, LocalDateTime dataHora, Profissional profissional, Paciente paciente, Receita receita,
            String linkAcesso) {
        super(id, dataHora, profissional, paciente, receita);
        this.linkAcesso = linkAcesso;
    }

    public String getLinkAcesso() {
        return linkAcesso;
    }

    public void setLinkAcesso(String linkAcesso) {
        this.linkAcesso = linkAcesso;
    }

    public void realizarConsulta() {
        System.out.println("Teleconsulta realizada com " + profissional.getNome() + " pelo link " + linkAcesso);
    }

    @Override
    public String toString() {
        return super.toString() + "\nLink de acesso: " + linkAcesso;
    }
}
