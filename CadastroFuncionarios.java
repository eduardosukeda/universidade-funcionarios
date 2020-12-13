import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class CadastroFuncionarios {
    private Map<String, Funcionario> funcionarios;

    public CadastroFuncionarios() {
        funcionarios = new HashMap<String, Funcionario>();
    }

    public void cadastraFuncionario(Funcionario funcionario) {
        funcionarios.put(funcionario.getMatricula(), funcionario);
        gerarArquivoCSV();
    }

    public Funcionario getFuncionarioPorMatricula(String matricula) {

        for (Map.Entry<String, Funcionario> entrada : funcionarios.entrySet()) {
            if (entrada.getKey().equals(matricula)) {
                return entrada.getValue();
            }
        }
        return null;
    }

    private void gerarArquivoCSV() {
        try {

            FileWriter writer = new FileWriter(System.getProperty("user.home") + "//funcionario.csv", StandardCharsets.ISO_8859_1);

            writer.append("Matricula");
            writer.append(';');
            writer.append("Nome");
            writer.append(';');
            writer.append("Salario bruto");
            writer.append(';');
            writer.append("(-) INSS");
            writer.append(';');
            writer.append("(-) IR");
            writer.append(';');
            writer.append("Salario liquido");
            writer.append(';');
            writer.append("\n");

            for (Map.Entry<String, Funcionario> entrada : funcionarios.entrySet()) {
                writer.append(entrada.getValue().getMatricula());
                writer.append(';');
                writer.append(entrada.getValue().getNome());
                writer.append(';');
                writer.append(String.valueOf(entrada.getValue().getSalarioBruto()));
                writer.append(';');
                writer.append(String.valueOf(entrada.getValue().getINSS()));
                writer.append(';');
                writer.append(String.valueOf(entrada.getValue().getImpRenda()));
                writer.append(';');
                writer.append(String.valueOf(entrada.getValue().getSalarioLiquido()));
                writer.append(';');
                writer.append("\n");
            }

            writer.flush();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}