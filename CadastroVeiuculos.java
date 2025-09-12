import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroVeiuculos {
    static Scanner scan = new Scanner(System.in);
    static List<String> veiculos = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("==== Bem Vindo ao Controle de Frotas das Divas ! ====");
        String menu = """
                Escolha uma das opções abaixo:
                1- Cadastrar Veículos
                2- Listar Veículos
                3- Excluir Veículos
                
                """;
        int opcao;
        do {
            System.out.println(menu);
            opcao = Input.scanInt("Escolha uma opção: ", scan);
            switch (opcao) {
                case 1:
                    cadastraVeiculo();
                    System.out.println("Pressione enter para continuar.");
                    scan.nextLine(); //forçar parada
                    break;
                case 2:
                    listaVeiculos();
                    System.out.println("Pressione enter para continuar.");
                    scan.nextLine(); //forçar parada
                    break;
                case 3:
                    removeVeiculo();
                    System.out.println("Pressione enter para continuar.");
                    scan.nextLine(); //forçar parada
                    break;
                case 0:
                    System.out.println("Volte Sempre!!");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 0);
    }

    static void cadastraVeiculo() { // void: não retorna
        System.out.println("==== Cadastrando novo veículo ====");
        String veiculo = Input.scanString("Digite o nome do veículo: ", scan);
        veiculos.add(veiculo);
    }

    static void listaVeiculos() {
        System.out.println("==== Veículos Cadastrados ====");
        int i = 1;
        for (String veiculo : veiculos) {
            System.out.println("Veículo " + i++ + ": " + veiculo);
        }
    }

    static void removeVeiculo(){
        listaVeiculos();
        int i = Input.scanInt("Qual veículo deseja remover? ", scan);
        veiculos.remove(--i);
        System.out.println("Veículo removido.");
    }
}