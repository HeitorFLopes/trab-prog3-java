
import java.util.ArrayList;

public class Informacoes {
    public ArrayList<Ubs> ubs = new ArrayList<Ubs>();
    public ArrayList<Servidor> servidores = new ArrayList<Servidor>();
    public ArrayList<Vacina> vacinas = new ArrayList<Vacina>();
    public ArrayList<Cidadao> cidadaos = new ArrayList<Cidadao>();
    public ArrayList<Lote> lotes = new ArrayList<Lote>();
    public ArrayList<Agendamento> agendamentos = new ArrayList<Agendamento>();

    Ubs buscaUbs(String sigla){
        for(Ubs ub: this.ubs){
            if(ub.getSigla().equals(sigla)) {
                return ub;
            }
        }
        return null;
    }

    Servidor buscaServidor(int matricula){
        for(Servidor s: this.servidores){
            if(s.getMatricula()==matricula)
                return s;
        }
        return null;
    }

    Vacina buscaVacina(String vacina){
        for(Vacina v: this.vacinas){
            if(v.getNome().equals(vacina))
                return v;
        }
        return null;
    }
    Cidadao buscaCidadao(String cpf) {
        for (Cidadao c : this.cidadaos){
            if (c.getCpf().equals(cpf))
                return c;
        }
        return null;
    }

    Agendamento buscaAgendamento(String cpf){
        for(Agendamento a: this.agendamentos){
            if(a.getCidadao().getCpf().equals(cpf))
                    return a;
        }
        return null;
    }

}
