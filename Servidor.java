
public class Servidor extends Cidadao{
    private int matricula;
    private Ubs ubs;

    public Servidor(String nome, int matricula, Ubs ubs, String nascimento){
        super(nome,nascimento);
        this.matricula = matricula;
        this.ubs = ubs;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Ubs getUbs() {
        return ubs;
    }

    public void setUbs(Ubs ubs) {
        this.ubs = ubs;
    }


    @Override
    public String toString() {
        return "Servidor{" +
                "nome="+ this.nome +
                ", matricula=" + matricula +
                ", ubs=" + this.ubs.getSigla() +
                ", nascimento="+ this.nascimento +
                '}';
    }
}
