package model;

import java.time.LocalDateTime;

public class ConsultaPresencial extends Consulta {
    private UnidadeHospitalar local;

    public ConsultaPresencial(Long id, LocalDateTime dataHora, Profissional profissional, Paciente paciente,
            UnidadeHospitalar local) {
        super(id, dataHora, profissional, paciente);
        this.local = local;
    }

    public UnidadeHospitalar getLocal() {
        return local;
    }

    public void setLocal(UnidadeHospitalar local) {
        this.local = local;
    }
    
}

