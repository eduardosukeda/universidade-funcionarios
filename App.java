public class App {
    public static void main(String args[]) {
        CadastroFuncionarios cf = new CadastroFuncionarios();
        cf.cadastraFuncionario(new Funcionario("A101", "Vital Brazil", 1890.0));
        cf.cadastraFuncionario(new Funcionario("A102", "Juliano Moreira", 3720.0));
        cf.cadastraFuncionario(new Funcionario("B201", "Graziela Maciel Barroso", 8940.0));
        cf.cadastraFuncionario(new Funcionario("B202", "César Lattes", 4220.0));
        cf.cadastraFuncionario(new Funcionario("C301", "Oswaldo Cruz", 1283.0));
        cf.cadastraFuncionario(new Funcionario("C302", "Carlos Chagas", 12438.0));

        cf.cadastraFuncionario(new Professor("D101", "Eduardo Silva", 8560.0, Professor.TipoProfessor.Adjunto));
        cf.cadastraFuncionario(new Professor("D102", "Marta Roberta", 9451.0, Professor.TipoProfessor.Titular));
        cf.cadastraFuncionario(new Professor("D103", "Liliane Pontes", 7541.0, Professor.TipoProfessor.Assistente));

        cf.cadastraFuncionario(new Pesquisador("E101", "Fabiana Silva", 8412.0, Professor.TipoProfessor.Titular, 1));
        cf.cadastraFuncionario(new Pesquisador("E102", "Marcia Prado", 9871.0, Professor.TipoProfessor.Assistente, 2));
        cf.cadastraFuncionario(new Pesquisador("E103", "Cristiane Ferreira", 10457.0, Professor.TipoProfessor.Assistente, 3));

        Funcionario f = cf.getFuncionarioPorMatricula("D101");
        System.out.println(f);
    }
}