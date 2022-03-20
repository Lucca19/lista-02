import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Prefeitura {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] vSalario = new double[4];
        int[] vFilhos = new int[4];

        int op = 0;

        while(op != 9){
            System.out.print("\n");
            System.out.print("Menu\n");
            System.out.print(" 1 - Cadastro de informações \n");
            System.out.print(" 2 - A média de salário da população \n");
            System.out.print(" 3 - A média do número de filhos \n");
            System.out.print(" 4 - O maior salário \n");
            System.out.print(" 5 - Porcentagem de pessoas com salários de até R$ 400,00 \n");
            System.out.print(" 9 - Sair \n");
            System.out.print("\n");
            System.out.print("Digite uma das opções acima: ");

            op = input.nextInt();

            switch (op) { 
                case 1:
                    for (int i = 0; i < vSalario.length; i++) { 

                        System.out.println("\nInsira o salário do chefe da familia: ");
                        double salario = input.nextDouble();

                        System.out.println("Número de filhos: ");
                        int filhos = input.nextInt();

                        if (salario == -1 || filhos == -1) {
                            break;
                        } else {
                            vFilhos[i] = filhos;
                            vSalario[i] = salario;
                        }
                    }
                    break;
                case 2:
                    double soma = 0;
                    double media = 0;
                    for (int i = 0; i<vSalario.length; i++) { 
                        soma = vSalario[i] + soma;
                    }
                    media = soma / vSalario.length;
                    System.out.println( "\nA Média salárial da população é: " + media);
                    break;

                case 3:
                    double somaF = 0;
                    double mediaF = 0;

                    for(int i=0; i<vFilhos.length; i++){ 
                        somaF = vFilhos[i] + somaF;
                    }
                    mediaF = somaF / vFilhos.length;
                    System.out.println( "\nA Média de filhos da população é: " + mediaF);
                    break;

                case 4:
                    double maior = 0;
                    for(int i =0; i < vSalario.length; i++){
                        if(vSalario[i] > maior){
                            maior = vSalario[i];
                        }else{
                            i++;
                        }
                    }
                    System.out.println( "\nO Maior salário é: " + maior);
                    break;

                case 5:
                    int pessoas = 0;
                    double percentual = 0;
                    for (int i = 0; i<vSalario.length; i++){ 
                        if(vSalario[i] <= 400){
                            pessoas++;
                        }
                    }

                    percentual = (pessoas * 100) / vSalario.length;

                    System.out.println( "\nO Percentual de pessoas com salários de até R$ 400,00 é: " + percentual + "%");
                    break;

                default:
                    System.out.print("\nESTA OPÇÃO NÃO É VALIDA");
                    break;

                case 9:
                    System.out.print("\nFim");
                    break;
            }
        }
    }
}

