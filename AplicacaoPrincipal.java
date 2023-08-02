import java.util.Scanner;

public class AplicacaoPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FabricaDeJoias fabricaDeJoias = new FabricaDeJoias();

        while (true) {
            System.out.println("1. Adicionar Anel");
            System.out.println("2. Adicionar Colar");
            System.out.println("3. Adicionar Brinco");
            System.out.println("4. Buscar Joia por Tipo");
            System.out.println("5. Encontrar Tipo de Joia Mais Cara");
            System.out.println("0. Sair");
            System.out.print("Digite sua escolha: ");
            int escolha = scanner.nextInt();

            scanner.nextLine(); // Limpa o caractere de nova linha do buffer

            switch (escolha) {
                case 1:
                    System.out.print("Valor do Anel: ");
                    double valorAnel = scanner.nextDouble();
                    System.out.print("Peso do Anel: ");
                    double pesoAnel = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Material do Anel: ");
                    String materialAnel = scanner.nextLine();
                    System.out.print("Quantidade em Estoque do Anel: ");
                    int quantidadeEstoqueAnel = scanner.nextInt();

                    Anel anel = new Anel(valorAnel, pesoAnel, materialAnel, quantidadeEstoqueAnel);
                    fabricaDeJoias.adicionarJoia(anel);
                    break;
                case 2:
                    System.out.print("Valor do Colar: ");
                    double valorColar = scanner.nextDouble();
                    System.out.print("Peso do Colar: ");
                    double pesoColar = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Material do Colar: ");
                    String materialColar = scanner.nextLine();
                    System.out.print("Quantidade em Estoque do Colar: ");
                    int quantidadeEstoqueColar = scanner.nextInt();

                    Colar colar = new Colar(valorColar, pesoColar, materialColar, quantidadeEstoqueColar);
                    fabricaDeJoias.adicionarJoia(colar);
                    break;
                case 3:
                    System.out.print("Valor do Brinco: ");
                    double valorBrinco = scanner.nextDouble();
                    System.out.print("Peso do Brinco: ");
                    double pesoBrinco = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Material do Brinco: ");
                    String materialBrinco = scanner.nextLine();
                    System.out.print("Quantidade em Estoque do Brinco: ");
                    int quantidadeEstoqueBrinco = scanner.nextInt();
                    Brinco brinco = new Brinco(valorBrinco, pesoBrinco, materialBrinco, quantidadeEstoqueBrinco);
                    fabricaDeJoias.adicionarJoia(brinco);
                    break;
                case 4:
                    System.out.print("Digite o tipo de joia para buscar: ");
                    String tipoParaBuscar = scanner.nextLine();
                    fabricaDeJoias.buscarJoiaPorTipo(tipoParaBuscar);
                    break;
                case 5:
                    String tipoJoiaMaisCara = fabricaDeJoias.encontrarTipoDeJoiaMaisCara();
                    System.out.println("O tipo de joia mais cara é: " + tipoJoiaMaisCara);
                    break;
                case 0:
                    System.out.println("Encerrando o programa. Até logo!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Escolha inválida. Por favor, tente novamente.");
            }
        }
    }
}
