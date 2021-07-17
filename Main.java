

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Informacoes info = new Informacoes();
        int auxi1,auxi2;
        String auxs1,auxs2,auxs3,auxs4,auxs5;
        double auxf1;
        char auxc1;
        int opcao;

        System.out.println("Menu:\n 1 - Cadastrar Unidade Básica de Saúde (UBS)(1)\n 2 - Cadastrar servidor municipal(2)\n" +
                " 3 - Cadastrar vacina(3)\n 4 - Receber lote de vacinas(4)\n 5 - Agendar vacinação(5)\n" +
                " 6 - Cancelar agendamento de vacinação(6)\n 7 - Registrar vacinação efetuada(7)\n 0 - Sair do programa(0)");
        System.out.print("Escolha a funcionalidade: ");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        opcao= sc.nextInt();
        sc.nextLine();

        while (opcao!=0){
            if(opcao==1) { //Cadastrar UBS
                System.out.print("Nome: ");
                auxs1=sc.nextLine();
                System.out.print("Sigla: ");
                auxs2=sc.nextLine();
                Ubs ub1 = new Ubs(auxs1,auxs2);
                info.ubs.add(ub1);
                System.out.printf("\nUnidades Básicas de Saúde cadastradas:\n");
                for (Ubs aux:info.ubs) {
                    System.out.println(aux);
                }
            }
            else if (opcao==2){ //Cadastrar servidor
                System.out.print("Nome: ");
                auxs1=sc.nextLine();
                System.out.print("Matrícula: ");
                auxi1=sc.nextInt();
                sc.nextLine();
                System.out.print("UBS: ");
                auxs2= sc.nextLine();
                System.out.println("Data de nascimento: ");
                auxs3 = sc.nextLine();
                if(auxs3.isBlank()) auxs3 = null;
                Servidor serv;
                Ubs ubs= info.buscaUbs(auxs2);

                serv = new Servidor(auxs1, auxi1, ubs, auxs3);
                info.servidores.add(serv);
                System.out.printf("\nServidores:\n");
                for (Servidor serv2: info.servidores){
                    System.out.println(serv2);
                }
            }
            else if(opcao==3){ //Cadastrar vacina
                System.out.print("Nome: ");
                auxs1=sc.nextLine();
                System.out.print("Fabricante: ");
                auxs2=sc.nextLine();
                System.out.print("Doença: ");
                auxs3=sc.nextLine();
                Vacina vacina = new Vacina(auxs1,auxs2,auxs3);
                info.vacinas.add(vacina);
                System.out.printf("\nVacinas:\n");
                for(Vacina vac: info.vacinas){
                    System.out.println(vac);
                }
            }

            else if(opcao==4){ //Cadastrar lote
                System.out.print("Vacina: ");
                auxs1=sc.nextLine();
                System.out.print("UBS: ");
                auxs2=sc.nextLine();
                System.out.println("Data de recebimento: ");
                auxs3=sc.nextLine();
                System.out.print("Quantidade: ");
                auxi1=sc.nextInt();
                System.out.print("Custo por dose: ");
                auxf1=sc.nextDouble();
                System.out.print("Fonte: ");
                auxc1=sc.next().charAt(0);
                Lote lote = new Lote(info.buscaVacina(auxs1),info.buscaUbs(auxs2),auxs3,auxi1,auxf1,auxc1);
                info.lotes.add(lote);
                for(Lote l: info.lotes){
                    System.out.println(l);
                }
            }

            else if(opcao==5){ //Agendar vacina
                System.out.print("Data/Hora: ");
                auxs1=sc.nextLine();
                System.out.print("UBS: ");
                auxs2=sc.nextLine();
                System.out.print("Nome: ");
                auxs3=sc.nextLine();
                System.out.print("Data de nascimento: ");
                auxs4=sc.nextLine();
                System.out.print("CPF: ");
                auxs5=sc.nextLine();
                if(auxs4.isBlank()) auxs4 = null; //adciona null ao campo nascimento
                Cidadao cidadao = new Cidadao(auxs3,auxs4,auxs5);
                if(info.buscaCidadao(auxs5)==null)
                    info.cidadaos.add(cidadao);
                Ubs ubs = info.buscaUbs(auxs2);
                Agendamento ag = new Agendamento(auxs1,cidadao,ubs);
                info.agendamentos.add(ag);

                for(Agendamento a:info.agendamentos)
                    System.out.println(a);

            }

            else if (opcao==6){ //Cancelar vacinação
                System.out.print("CPF: ");
                auxs1=sc.nextLine();
                Agendamento ag = info.buscaAgendamento(auxs1);

                ag.cancelaAgendamento();

                for(Agendamento a:info.agendamentos)
                    System.out.println(a);

            }

            else if(opcao==7){ //Registrar vacinação efetuada
                System.out.print("CPF: ");
                auxs1=sc.nextLine();
                System.out.print("Matrícula: ");
                auxi1= sc.nextInt();

                Agendamento ag = info.buscaAgendamento(auxs1);
                Servidor servidor = info.buscaServidor(auxi1);

                ag.efetuaAgendamento(servidor);

                for(Agendamento a:info.agendamentos)
                    System.out.println(a);
            }


            System.out.println("Menu:\n 1 - Cadastrar Unidade Básica de Saúde (UBS)(1)\n 2 - Cadastrar servidor municipal(2)\n" +
                    " 3 - Cadastrar vacina(3)\n 4 - Receber lote de vacinas(4)\n 5 - Agendar vacinação(5)\n" +
                    " 6 - Cancelar agendamento de vacinação(6)\n 7 - Registrar vacinação efetuada(7)\n 0 - Sair do programa(0)");
            System.out.print("Escolha a funcionalidade: ");
            opcao=sc.nextInt();
            sc.nextLine();
        }


    }
}
