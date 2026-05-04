public class AlunoIntegral extends Aluno {
    private double mensalidadeDiurna = 300;

    public AlunoIntegral(String nome, String matricula, String email, String dataNascimento, String serie) {
        super(nome, matricula, email, dataNascimento, serie);
        this.mensalidadeDiurna = mensalidadeDiurna;
    }





    public double getMensalidadeDiurna() {
        return mensalidadeDiurna;
    }

    public void setMensalidadeDiurna(double mensalidadeDiurna) {
        this.mensalidadeDiurna = mensalidadeDiurna;
    }

    public double calcularMensalidade() {
          return getValorBase() + getMensalidadeDiurna();


    }
}