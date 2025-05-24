package model;

import java.time.LocalDateTime;

public class ConsultaPresencial extends Consulta {
    private UnidadeHospitalar local;

    public ConsultaPresencial(Long id, LocalDateTime dataHora, Profissional profissional, Paciente paciente, Receita receita,
            UnidadeHospitalar local) {
        super(id, dataHora, profissional, paciente, receita);
        this.local = local;
    }

    public UnidadeHospitalar getLocal() {
        return local;
    }

    public void setLocal(UnidadeHospitalar local) {
        this.local = local;
    }

    public void realizarConsulta() {
        System.out.println("Consulta presencial realizada com " + profissional.getNome() + " na unidade " + local.getNome());
    }

    @Override
    public String toString() {
        return super.toString() + "\nLocal: " + local;
    }
}

