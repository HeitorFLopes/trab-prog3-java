
public class Cidadao {
    protected String nome;
    protected  String cpf;
    protected  String nascimento;

    public Cidadao() {
    }

    public Cidadao(String nome) {
        this.nome = nome;
    }

    public Cidadao(String nome, String nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public Cidadao(String nome, String nascimento, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
    }




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    @Override
    public String toString() {
        return "Cidadao{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", nascimento='" + nascimento + '\'' +
                '}';
    }


}
