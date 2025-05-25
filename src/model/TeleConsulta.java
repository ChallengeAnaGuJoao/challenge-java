package model;

import java.time.LocalDateTime;

public class TeleConsulta extends Consulta {
    private String plataforma;

    public TeleConsulta(Long id, LocalDateTime dataHora, Profissional profissional, Paciente paciente, Receita receita,
            String plataforma) {
        super(id, dataHora, profissional, paciente, receita);
        this.plataforma = plataforma;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public void realizarConsulta() {
        System.out.println("Teleconsulta realizada com " + profissional.getNome() + " pela plataforma " + plataforma);
    }

    @Override
    public String toString() {
        return super.toString() + "\nPlataforma: " + plataforma;
    }
}
