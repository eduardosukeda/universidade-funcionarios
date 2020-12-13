public class Pesquisador extends Professor {

    private int categoria;

    public Pesquisador(String matricula, String nome, double salarioBruto, TipoProfessor tipo, int categoria) {
        super(matricula, nome, salarioBruto, tipo);
        this.categoria = categoria;
    }

    @Override
    public double getSalarioLiquido() {
        double percent = 0.0;
        switch (categoria) {
            case 1:
                percent = 1.05;
                break;
            case 2:
                percent = 1.1;
                break;
            case 3:
                percent = 1.2;
                break;
        }
        return getSalarioBruto() * percent;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
}