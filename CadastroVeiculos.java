import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroVeiculos {
    static Scanner scan = new Scanner(System.in);
    static List<Veiculo> veiculos = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("==== Bem Vindo ao Controle de Frotas das Divas ! ====");
        String menu = """
                Escolha uma das opções abaixo:
                1- Cadastrar Veículos
                2- Listar Veículos
                3- Excluir Veículos
                4- Pesquisar Veículo
                0- Sair
                """;

        int opcao;
        do {
            System.out.println(menu);
            opcao = Input.scanInt("Escolha uma opção: ", scan);
            switch (opcao) {
                case 1:
                    cadastraVeiculo();
                    System.out.println("Pressione enter para continuar.");
                    scan.nextLine(); 
                    break;
                case 2:
                    listaVeiculos();
                    System.out.println("Pressione enter para continuar.");
                    scan.nextLine(); 
                    break;
                case 3:
                    removeVeiculo();
                    System.out.println("Pressione enter para continuar.");
                    scan.nextLine(); 
                    break;
                case 4:
                    pesquisarVeiculo();
                    System.out.println("Pressione enter para continuar.");
                    scan.nextLine();
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

    static void cadastraVeiculo() {
        System.out.println("==== Cadastrando novo veículo ====");
        String marca = Input.scanString("Digite a marca: ", scan);
        String modelo = Input.scanString("Digite o modelo: ", scan);
        int ano = Input.scanInt("Digite o ano: ", scan);
        String placa = Input.scanString("Digite a placa: ", scan);

        // Verifica duplicidade da placa
        for (Veiculo v : veiculos) {
            if (v.getPlaca().equalsIgnoreCase(placa)) {
                System.out.println("Erro: Já existe um veículo com esta placa!");
                return;
            }
        }

        Veiculo v = new Veiculo(marca, modelo, ano, placa);
        veiculos.add(v);
        System.out.println("Veículo cadastrado com sucesso!");
    }


    static void listaVeiculos() {
        System.out.println("==== Veículos Cadastrados ====");
        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.");
            return;
        }
        for (Veiculo veiculo : veiculos) {
            System.out.println(veiculo);
        }
    }

    static void removeVeiculo() {
        System.out.println("==== Remover Veículo ====");
        String placa = Input.scanString("Digite a placa do veículo a remover: ", scan);

        Veiculo encontrado = null;
        for (Veiculo v : veiculos) {
            if (v.getPlaca().equalsIgnoreCase(placa)) {
                encontrado = v;
                break;
            }
        }

        if (encontrado != null) {
            veiculos.remove(encontrado);
            System.out.println("Veículo removido com sucesso!");
        } else {
            System.out.println("Placa não encontrada.");
        }
    }

    static void pesquisarVeiculo() {
        System.out.println("==== Pesquisar Veículo ====");
        System.out.println("1 - Pesquisar por Placa");
        System.out.println("2 - Pesquisar por Modelo");

        int tipo = Input.scanInt("Escolha uma opção: ", scan);

        switch (tipo) {
            case 1: {
                String placa = Input.scanString("Digite a placa: ", scan);
                boolean achou = false;
                for (Veiculo v : veiculos) {
                    if (v.getPlaca().equalsIgnoreCase(placa)) {
                        System.out.println(v);
                        achou = true;
                    }
                }
                if (!achou) System.out.println("Nenhum veículo encontrado com essa placa.");
            }
                break;
            case 2: {
                String modelo = Input.scanString("Digite parte do modelo: ", scan);
                boolean achou = false;
                for (Veiculo v : veiculos) {
                    if (v.getModelo().toLowerCase().contains(modelo.toLowerCase())) {
                        System.out.println(v);
                        achou = true;
                    }
                }
                if (!achou) System.out.println("Nenhum veículo encontrado com esse modelo.");
            }
                break;
            default: System.out.println("Opção inválida.");
        }
    }

}