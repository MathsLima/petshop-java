import java.util.ArrayList;

public class Pet {
    //variaveis do pet
    private String nome;
    private String tipo;
    private String raca;
    private int idade;
    private String nomeDono;
    private String telefoneDono;
    private String[] agendamento;
    private boolean[] servicosUtilizados;
    private int servicosRealizados;
    
    //metodo construtor do pet
    public Pet(String nome, String tipo, String raca, int idade, String nomeDono, String telefoneDono) {
        this.nome = nome;
        this.tipo = tipo;
        this.raca = raca;
        this.idade = idade;
        this.nomeDono = nomeDono;
        this.telefoneDono = telefoneDono;
        this.agendamento = new String[7];
        this.servicosUtilizados = new boolean[6];
        this.servicosRealizados = 0;
    }

    //metodo para registrar um serviço
    public void registrarServico(String servico, int numServicos) {
        agendamento[servicosRealizados] = servico;
        servicosUtilizados[numServicos - 1] = true;
        servicosRealizados++;
    }
    
    //metodo para adicionar um serviço
    public void adicionarServico(int escolhaServico) {
        if (escolhaServico >= 1 && escolhaServico <= 6) {
            servicosUtilizados[escolhaServico - 1] = true;
            servicosRealizados++;
        } else {
            System.out.println("Escolha de serviço inválida.");
        }
    }
    
    //metodo para alterar o numero de telefone
    public void alterarTelefone(String novoTelefone){
        this.telefoneDono = novoTelefone;
    }
    
    //metodo para alterar o agendamento
    public void alterarAgendamento(String novoAgendamento, int posicao){
        agendamento[posicao - 1] = novoAgendamento;
    }
    
    //metodo para alterar os serviços utilizados
     public void alterarServicosUtilizados(boolean[] novosServicos) {
        this.servicosUtilizados = novosServicos;
    }
    
    //metodo para calcular o valor total
    public double calcularValorTotal() {
        double valorTotal = 0;
        
        //supondo custo de servico
        double[] custoServico  = {20.0, 15.5, 10.0, 25.0, 5.0, 0.0};
        
        for(int i=0; i<servicosUtilizados.length; i++){
            if(servicosUtilizados[i]){
                valorTotal += custoServico[i];
            }
        }
        
        return valorTotal;
    }
    
    //metodo to string
    public String toString() {
        String result = "Nome: " + nome + "\nTipo: " + tipo + "\nRaça: " + raca +
                "\nIdade: " + idade + "\nNome do Dono: " + nomeDono +
                "\nTelefone do Dono: " + telefoneDono;
      
        result += "\nServiços Utilizados: ";
        boolean algumServicoUtilizado = false;
        
        String[] nomesServicos = {
            "Banho",
            "Tosa",
            "Corte de unhas",
            "Hidratação do pelo",
            "Escovação dos dentes",
            "Outro"
        };
        
        for (int i = 0; i < servicosUtilizados.length; i++) {
            if (servicosUtilizados[i]) {
                algumServicoUtilizado = true;
                result += nomesServicos[i];
                if (i < servicosUtilizados.length - 1) {
                    result += " , ";
                }
            }
        }
        result += "\nValor Total: R$ " + calcularValorTotal();

        return result;
    }
    
    //getters
    public String getNome() {return nome;}
    public String getTipo() {return tipo;}
    public String getRaca() {return raca;}
    public int getIdade() {return idade;}
    public String getNomeDono() {return nomeDono;}
    public String getTelefoneDono() {return telefoneDono;}
    public String[] getAgendamento(){return agendamento;}
    public boolean[] getServicosUtilizados(){return servicosUtilizados;}
    public int getServicosRealizados(){return servicosRealizados;}
    
    //setters
    public String setNome() {return nome;}
    public String setTipo() {return tipo;}
    public String setRaca() {return raca;}
    public int setIdade() {return idade;}
    public String setNomeDono() {return nomeDono;}
    public String setTelefoneDono() {return telefoneDono;}
    public String[] setAgendamento(){return agendamento;}
    public boolean[] setServicosUtilizados(){return servicosUtilizados;}
    public int setServicosRealizados(){return servicosRealizados;}
}