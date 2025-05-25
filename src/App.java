import model.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Paciente paciente = cadastrarPaciente(scanner);
        Profissional profissional = cadastrarProfissional(scanner);
        Receita receita = cadastrarReceita(scanner, paciente, profissional);
        Consulta consulta = cadastrarConsulta(scanner, paciente, profissional, receita);

        System.out.println("\n--- CONSULTA ---");
        consulta.realizarConsulta();
        System.out.println(consulta);

        scanner.close();
    }

    private static Paciente cadastrarPaciente (Scanner scanner){
        System.out.println("--- Cadastro de Paciente ---");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.println("--- Endereço do Paciente ---");
        System.out.print("Quantos endereços deseja cadastrar? ");
        int qtd = parseInt(scanner.nextLine());
        List<Endereco> enderecos = new ArrayList<>();

        for (int i = 0; i < qtd; i++) {
            Endereco endereco = lerEndereco(scanner);
            enderecos.add(endereco);
        }
        return new Paciente(1, nome, cpf, enderecos);
    }

    private static Profissional cadastrarProfissional (Scanner scanner){
        System.out.println("--- Cadastro do Profissional ---");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Tipo: ");
        String tipo = scanner.nextLine();
        System.out.print("Especialidade: ");
        String nomeEspecialidade = scanner.nextLine();

        List<Especialidade> especialidades = new ArrayList<>();
        especialidades.add(new Especialidade(3, nomeEspecialidade));

        return new Profissional(2,nome, tipo, especialidades);
    }

    private static Receita cadastrarReceita (Scanner scanner, Paciente paciente, Profissional profissional){
        List<Prescricao> prescricoes = new ArrayList<>();
        System.out.println("--- Receita ---");
        System.out.print("Quantos medicamentos deseja cadastrar? ");
        int qtd = parseInt(scanner.nextLine());

        for (int i = 0; i < qtd; i++) {
            Prescricao prescricao = cadastrarPrescricao(scanner, i);
            prescricoes.add(prescricao);
        }
        System.out.print("Observações: ");
        String observacoes = scanner.nextLine();

        return new Receita(1, paciente, profissional, prescricoes, observacoes);
    }

    private static Prescricao cadastrarPrescricao (Scanner scanner, int id){
        Medicamento medicamento = cadastrarMedicamentos(scanner, id);
        System.out.print("Dosagem: ");
        String dosagem = scanner.nextLine();
        System.out.print("Frequência: ");
        String frequencia = scanner.nextLine();
        System.out.print("Observação: ");
        String observacao = scanner.nextLine();
        return new Prescricao(id,medicamento, dosagem, frequencia, observacao);
    }

    private static Medicamento cadastrarMedicamentos(Scanner scanner, int id){
        System.out.println("--- Medicamento ---");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Princípio ativo: ");
        String principioAtivo = scanner.nextLine();
        return new Medicamento(id, nome, principioAtivo);
    }

    private static Consulta cadastrarConsulta (Scanner scanner, Paciente paciente, Profissional medico, Receita receita){
        System.out.println("--- Consulta ---");
        System.out.print("Tipo de consulta (1 - Presencial | 2 - Teleconsulta): ");
        int tipo = parseInt(scanner.nextLine());

        if (tipo == 1) {
            System.out.println("--- Endereço da Unidade Hospitalar ---");
            Endereco enderecoUnidade = lerEndereco(scanner);
            System.out.print("Nome da Unidade: ");
            String nomeUnidade = scanner.nextLine();
            UnidadeHospitalar unidade = new UnidadeHospitalar(1,nomeUnidade, enderecoUnidade);
            return new ConsultaPresencial(1,LocalDateTime.now(), medico, paciente, receita, unidade);
        } else {
            System.out.print("Link da teleconsulta: ");
            String link = scanner.nextLine();
            return new TeleConsulta(1, LocalDateTime.now(), medico, paciente, receita, link);
        }
    }

    private static Endereco lerEndereco (Scanner scanner){
        System.out.print("Rua: ");
        String rua = scanner.nextLine();
        System.out.print("Número: ");
        String numero = scanner.nextLine();
        System.out.print("Bairro: ");
        String bairro = scanner.nextLine();
        System.out.print("Cidade: ");
        String cidade = scanner.nextLine();
        System.out.print("Estado: ");
        String estado = scanner.nextLine();
        System.out.print("CEP: ");
        String cep = scanner.nextLine();
        return new Endereco(rua, numero, bairro, cidade, estado, cep);
    }
}
