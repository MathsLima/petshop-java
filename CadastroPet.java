public class CadastroPet{
    private Pet[] pets;  
    private int quantPets;
    
    //metodo construtor
    public CadastroPet() {
        this.pets = new Pet[10];
        this.quantPets = 0;
    }
    
    //adicionar pets
    public void adicionarPet(Pet pet){      
        if (quantPets < pets.length){
                pets[quantPets] = pet;
                quantPets++;
            } else{
                System.out.println("Não é possível cadastrar um novo pet.");
            }
    }
    
    //metodo para remover do vetor
    public void removerPet(int indice){
        if (indice >= 0 && indice < quantPets){
            //desloca elementos para preencher o espaço vazio
            for(int i = indice; i<quantPets -1; i++){
                pets[i] = pets[i + 1];
            }
            quantPets--;
        } else{
            System.out.println("Não é possível remover, indice invalido");
        }
    }
    
    public void escreverTodosPets() {
        for (int i = 0; i < quantPets; i++) {
            System.out.println("Pet " + (i + 1) + ":\n" + pets[i] + "\n");
        }
    }
    
    //metodo para colocar os nomes em ordem alfabetica
    public void ordemalfabetica(){
        //pega os nomes de acordo com os indices
        String[] nomes = new String[quantPets];
        for(int i=0; i<quantPets; i++){
            nomes[i] = pets[i].getNome();
        }
        
        // ordena os nomes - utiliza Arrays.sort para isto
        java.util.Arrays.sort(nomes);
        for (String nome: nomes){
            System.out.println(nome);
        }
    }
    
    public void posicaoVetor() {
        for (int i = 0; i < quantPets; i++) {
            System.out.println(pets[i].getNome()  + " está na posição " + i);
        }
    }
    
    public void calcularMediaServicos() {
        int totalServicos = 0;
        double totalValor = 0;

        for (int i = 0; i < quantPets; i++) {
            totalServicos += pets[i].getServicosRealizados();
            totalValor += pets[i].calcularValorTotal();
        }
        
        if (quantPets > 0) {
        double mediaServicos = totalServicos / (double) quantPets;
        double mediaValor = totalValor / quantPets;

        System.out.println("Média dos serviços utilizados: " + mediaServicos);
        System.out.println("Média do valor dos serviços: " + mediaValor);
        } else {
            System.out.println("Não há pets cadastrados para calcular a média.");
        }
    }
}