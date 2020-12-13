public class Professor extends Funcionario {

    public enum TipoProfessor {Assistente, Adjunto, Titular}

    private TipoProfessor tipo;

    public Professor(String matricula, String nome, double salarioBruto, TipoProfessor tipo) {
        super(matricula, nome, salarioBruto);
        this.tipo = tipo;
    }

    @Override
    public double getSalarioLiquido() {
        return (getSalarioBruto() - getINSS() - getImpRenda()) * 1.3;
    }
}
