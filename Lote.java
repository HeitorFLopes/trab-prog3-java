
public class Lote {
    private Vacina vacina;
    private Ubs ubs;
    private String data;
    private int qtd;
    private double valorDose;
    private char fonteRecurso;

    public Lote(Vacina vacina, Ubs ubs, String data, int qtd, double valorDose, char fonteRecurso) {
        this.vacina = vacina;
        this.ubs = ubs;
        this.data = data;
        this.qtd = qtd;
        this.valorDose = valorDose;
        this.fonteRecurso = fonteRecurso;
    }

    public Vacina getVacina() {
        return vacina;
    }

    public Ubs getUbs() {
        return ubs;
    }

    public String getData() {
        return data;
    }

    public int getQtd() {
        return qtd;
    }

    public double getValorDose() {
        return valorDose;
    }

    public char getFonteRecurso() {
        return fonteRecurso;
    }


    @Override
    public String toString() {
        return "Lote{" +
                "vacina=" + vacina.getNome() +
                ", ubs=" + ubs.getSigla() +
                ", data='" + data + '\'' +
                ", qtd=" + qtd +
                ", valorDose=" + valorDose +
                ", fonteRecurso=" + fonteRecurso +
                '}';
    }
}
