public class Aluno {
    private String nome;
    private String matricula;
    private String email;
    private String dataNascimento;
    private String serie;
    private double valorBase = 500;

    public Aluno(String nome, String matricula, String email, String dataNascimento, String serie, double valorBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.serie = serie;
        this.valorBase = valorBase;
    }

    public Aluno(String nome, String matricula, String email, String dataNascimento, String serie) {
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.serie = serie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }
    public double calcularMensalidade() {
        return valorBase;
    }


    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", email='" + email + '\'' +
                ", serie='" + serie + '\'' +
                '}';

    }
}


