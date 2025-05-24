import model.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Endereco enderecoPaciente = new Endereco("Rua A", "123", "Centro", "São Paulo", "SP", "01000-000");
        Endereco enderecoUnidade = new Endereco("Av. Central", "456", "Bela Vista", "São Paulo", "SP", "01300-000");

        List<Endereco> enderecosPaciente = new ArrayList<>();
        enderecosPaciente.add(enderecoPaciente);

        Paciente paciente = new Paciente(12L,"João Silva", "12345678900", enderecosPaciente);

        Especialidade esp = new Especialidade(1L, "Otorrinolaringologista");
        List<Especialidade> especialidades = new ArrayList<>();
        especialidades.add(esp);
        Profissional medico = new Profissional(31L,"Dr. Carlos", "Médico", especialidades);

        Medicamento medicamento = new Medicamento(5L,"Busonid", "Budesonida");

        List<Prescricao> prescricoes = new ArrayList<>();
        Prescricao prescricao = new Prescricao(medicamento, "50mcg", "12h", "Aplicar ao acordar e antes de dormir");
        prescricoes.add(prescricao);

        Receita receita = new Receita(2L, paciente, medico, prescricoes, "Instruções adicionais");

        UnidadeHospitalar unidade = new UnidadeHospitalar(3L, "Hospital Central", enderecoUnidade);

        ConsultaPresencial presencial = new ConsultaPresencial(6L, LocalDateTime.now(), medico, paciente, receita, unidade);
        TeleConsulta teleconsulta = new TeleConsulta(6L, LocalDateTime.now(), medico, paciente, receita, "Zoom");

        System.out.println("--- INFORMAÇÕES DO PACIENTE ---");
        System.out.println(paciente);

        System.out.println("\n--- INFORMAÇÕES DO MÉDICO ---");
        System.out.println(medico);

        System.out.println("\n--- PRESCRIÇÃO ---");
        System.out.println(prescricao);

        System.out.println("\n--- CONSULTAS ---");
        presencial.realizarConsulta();
        teleconsulta.realizarConsulta();

        System.out.println("\n--- UNIDADE HOSPITALAR ---");
        System.out.println(unidade);
    }
}
