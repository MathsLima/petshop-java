import java.util.*;

public class Aplicacao{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        CadastroPet cadastro = new CadastroPet(); //cria o objeto com a classe CadastroPet
        
        System.out.println("\f");
        int opcao; 
        
        do{
            //menu usuario
            System.out.println("\n");
            System.out.println("-     MENU    -");
            System.out.println("Escolha a opção desejada:");
            System.out.println("1 - Adicionar Pet");
            System.out.println("2 - Remover Pet");
            System.out.println("3 - Escrever a Lista de Pets");
            System.out.println("4 - Exibir Posição dos Pets no Vetor");
            System.out.println("5 - Escrever Nomes em Ordem Alfabetica");
            System.out.println("6 - Calcular Media de Servicos");
            System.out.println("0 - Sair");
            
            opcao = teclado.nextInt(); //input do usuario
            teclado.nextLine(); 
            switch(opcao){
                case 1:
                    adicionarPet(teclado, cadastro);
                    break;
                case 2:
                    removerPet(teclado, cadastro);
                    break;
                case 3:
                    cadastro.escreverTodosPets();
                    break;
                case 4:
                    cadastro.posicaoVetor();
                    break;
                case 5:
                    cadastro.ordemalfabetica();
                    break;
                case 6:
                    cadastro.calcularMediaServicos();
                    break;
                case 0:
                    System.out.println("Saindo do programa. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Digite uma opção válida.");
                    break;
            }
        } while (opcao != 0);
    }
    
    private static void adicionarPet(Scanner scanner, CadastroPet cadastroPet) {
        System.out.print("Digite o nome do pet:");
        String nome = scanner.nextLine();

        System.out.print("Digite o tipo do pet:");
        String tipo = scanner.nextLine();

        System.out.print("Digite a raça do pet:");
        String raca = scanner.nextLine();

        System.out.print("Digite a idade do pet:");
        int idade = scanner.nextInt();
        scanner.nextLine(); //limpa o scanner

        System.out.print("Digite o nome do dono do pet:");
        String nomeDono = scanner.nextLine();

        System.out.print("Digite o telefone do dono do pet:");
        String telefoneDono = scanner.nextLine();

        Pet novoPet = new Pet(nome, tipo, raca, idade, nomeDono, telefoneDono);
        cadastroPet.adicionarPet(novoPet);
        
        System.out.println("Escolha os servicos que serao utilizados (1 a 6): ");
        System.out.println("Escolha um serviço:");
        System.out.println("1. Banho - R$20");
        System.out.println("2. Tosa - R$15.5");
        System.out.println("3. Corte de unhas - R$10");
        System.out.println("4. Hidratação do pelo - R$25.0");
        System.out.println("5. Escovação dos dentes - R$5");
        System.out.println("6. Outro - R$0");
        for (int i = 1; i <= 6; i++) {
                System.out.print("Serviço " + i + ": ");
                int escolhaServico = scanner.nextInt();
                novoPet.adicionarServico(escolhaServico);
        }

        System.out.println("Pet adicionado com sucesso!");
    }

    private static void removerPet(Scanner scanner, CadastroPet cadastroPet) {
        System.out.println("Digite o índice do pet que você deseja remover:");
        int indice = scanner.nextInt();
        scanner.nextLine(); //limpa o scanner
        
        cadastroPet.removerPet(indice);

        System.out.println("Pet removido com sucesso!");
    }
}
