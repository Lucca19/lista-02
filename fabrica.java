import java.util.Scanner;

public class fabrica {

    public static void AcharValor(int[] vetor) { // Função para encontrar o menor numero do array
        int valor = 0;
        for (int i = 0; i < vetor.length; i++) {
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];
        int opcao = 0;
        int maior = 0, menor = 0;

        while (opcao != 9) { // Este laço de repetição está mostrando ao usuario as opções que do programa.
            System.out.print("\n-    Menu    -\n");
            System.out.print(" 1 - Para : Inserir a quantidade total produzida \n");
            System.out.print(" 2 - Para : Quantidade produzida ao ano \n");
            System.out.print(" 3 - Para : Menor produção diária \n");
            System.out.print(" 4 - Para : Maior produção diária \n");
            System.out.print(" 9 - Exit \n");
            System.out.print(" Digite uma das opções acima: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    for (int i = 0; i < vetor.length; i++) { // Este laço de repetição está recebendo a quantidade que
                                                             // foi produzida.
                        int num;
                        System.out.println("Digite o valor da quantidade produzida: ");
                        num = input.nextInt();

                        if (num == -1) {
                            System.out.println("-- Dia sem produção detectado --");
                            break;
                        } else {
                            vetor[i] = num;
                        }
                    }
                    break;

                case 2:
                    int valor = 0;
                    for (int i = 0; i < vetor.length; i++) { // Este laço de repetição está somando os valores para
                                                             // determinar a quantidade produzida ao longo do ano.
                        valor = vetor[i] + valor;
                    }
                    System.out.println("\nQuantidade produzida ao longo do ano: " + valor);
                    break;

                case 3:
                    for (int i = 0; i <= vetor.length - 1; i++) { // Este laço de repetição está demonstrando o menor
                                                                  // valor dentro do vetor.
                        if (vetor[i] <= vetor[0]) {
                            menor = vetor[i];
                        }
                    }
                    System.out.print("\n Esta foi a menor produção diária: " + menor);
                    break;

                case 4:
                    for (int i = 0; i <= vetor.length - 1; i++) { // Este laço de repetição está demostrando o maior
                                                                  // valor encontrado no vetor.
                        if (vetor[i] >= maior) {
                            maior = vetor[i];
                        }
                    }
                    System.out.print("\n Esta foi a maior produção diaria: " + maior);
                    break;

                default:
                    System.out.print("\n Opção Inválida ! ");
                    break;

                case 9:
                    System.out.print("\n Fim do programa ! ");
                    break;
            }
        }
    }
}