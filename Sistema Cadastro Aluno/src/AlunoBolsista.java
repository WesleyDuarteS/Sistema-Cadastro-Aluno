public class AlunoBolsista extends Aluno{
    private double indiceDesconto;

    public AlunoBolsista(String nome, String matricula, String email, String dataNascimento, String serie, double indiceDesconto) {
        super(nome, matricula, email, dataNascimento, serie);
        this.indiceDesconto = indiceDesconto;
    }


    public double calcularMensalidade() {
        return getValorBase() - (getValorBase()*indiceDesconto);
    }

    }








