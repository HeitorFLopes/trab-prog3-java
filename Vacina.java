
public class Vacina {
    private String nome;
    private String fabricante;
    private String doenca;

    public Vacina(String nome, String fabricante, String doenca) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.doenca = doenca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getDoenca() {
        return doenca;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }

    @Override
    public String toString() {
        return "Vacina{" +
                "nome='" + nome + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", doenca='" + doenca + '\'' +
                '}';
    }
}
