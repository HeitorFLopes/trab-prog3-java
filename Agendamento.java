
public class Agendamento {
    private String dataHora;
    private Cidadao cidadao;
    private Ubs ubs;
    private char status; //a=agendado, e = efetuado, c = cancelado
    private Servidor servidor;


    public Agendamento(String dataHora, Cidadao cidadao, Ubs ubs) {
        this.dataHora = dataHora;
        this.cidadao = cidadao;
        this.ubs = ubs;
        this.ubs.getAgendamentos().add(this);
        this.status = 'a';
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public Cidadao getCidadao() {
        return cidadao;
    }

    public void setCidadao(Cidadao cidadao) {
        this.cidadao = cidadao;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Agendamento{" +
                "dataHora='" + dataHora + '\'' +
                ", ubs=" + ubs.getSigla() +
                ", cidadao=" + cidadao.getNome() +
                ", cpf=" + cidadao.getCpf() +
                ", status=" + status +
                '}';
    }

    public void cancelaAgendamento(){
        status = 'c';
    }

    public void efetuaAgendamento(Servidor servidor){
        servidor = servidor;
        status = 'e';
    }



}
