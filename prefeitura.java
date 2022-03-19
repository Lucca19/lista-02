import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Prefeitura {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] vetorS = new double[4];
        int[] vetorF = new int[4];

        int op = 0;

        while(op != 9){ //Para que volte ao menu após inserir dados ou escolher opção
            System.out.print("|-------------Menu---------------|\n");
            System.out.print("| 1 - Insira os dados |\n");
            System.out.print("| 2 - Média salárial da população |\n");
            System.out.print("| 3 - Média de número de filhos |\n");
            System.out.print("| 4 - Maior salário |\n");
            System.out.print("| 5 - Percentual de pessoas com salários de até R$ 400,00 |\n");
            System.out.print("| 9 - Sair |\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("Digite uma opção: ");

            op = input.nextInt();

            switch (op) { // Para escolher alguma das opções do menu
                case 1:
                    for (int i = 0; i < vetorS.length; i++) { // Inserir números ao vetor

                        System.out.println("\nInsira o salário do chefe da familia: ");
                        double salario = input.nextDouble();

                        System.out.println("Número de filhos: ");
                        int filhos = input.nextInt();

                        if (salario == -1 || filhos == -1) {
                            break;
                        } else {
                            vetorF[i] = filhos;
                            vetorS[i] = salario;
                        }

                    }
                    break;
                case 2:
                    double soma = 0;
                    double media = 0;
                    for (int i = 0; i<vetorS.length; i++) { // Para que corra o vetor e some todos os elementos
                        soma = vetorS[i] + soma;
                    }

                    media = soma / vetorS.length;
                    System.out.println( "\nMédia salárial da população: " + media);

                    break;

                case 3:
                    double somaF = 0;
                    double mediaF = 0;

                    for(int i=0; i<vetorF.length; i++){ // Para que corra o vetor e some todos os elementos
                        somaF = vetorF[i] + somaF;
                    }

                    mediaF = somaF / vetorF.length;
                    System.out.println( "\nMédia de filhos da população: " + mediaF);
                    break;
                case 4:
                    double maior = 0;
                    for(int i =0; i < vetorS.length; i++){ //Para encontrar o maior número do vetor
                        if(vetorS[i] > maior){
                            maior = vetorS[i];
                        }else{
                            i++;
                        }
                    }

                    System.out.println( "\nMaior salário: " + maior);
                    break;

                case 5:
                    int pessoas = 0;
                    double percentual = 0;
                    for (int i = 0; i<vetorS.length; i++){ // Percorre o vetor e encontra todos os salarios menores que 400
                        if(vetorS[i] <= 400){
                            pessoas++;
                        }
                    }

                    percentual = (pessoas * 100) / vetorS.length;

                    System.out.println( "\nPercentual de pessoas com salários de até R$ 400,00: " + percentual + "%");
                    break;

                default:
                    System.out.print("\nOpção Inválida!");
                    break;

                case 9:
                    System.out.print("\nAté logo!");
                    break;


            }

        }

    }
}

