
import java.util.ArrayList;

public class Ubs {
    private String nome;
    private String sigla;
    private ArrayList<Agendamento> agendamentos;

    public Ubs(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
        this.agendamentos = new ArrayList<Agendamento>();
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public ArrayList<Agendamento> getAgendamentos() {
        return agendamentos;
    }


    @Override
    public String toString() {
        return "Ubs{" +
                "nome='" + nome + '\'' +
                ", sigla='" + sigla + '\''+
                '}';
    }

    public void imprimeAgendamentos(){
        for(Agendamento ag: this.agendamentos){
            System.out.println(ag);
        }
    }


}
