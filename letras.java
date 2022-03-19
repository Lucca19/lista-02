import java.util.Arrays;
import java.util.Scanner;

public class Letras {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String ler[] = new String[10];

        int opcao = 0;
        while (opcao != 9) {
            System.out.print(" 1 - Introduzir caracteres para comparação: \n");
            System.out.print(" 2 - Quantidade total de letras “A” e “Z” informadas: \n");
            System.out.print(" 3 - Quantidade de caracteres informados; \n");
            System.out.print(" 4 - Quantidade de consoantes \n");
            System.out.print(" 5 - Maior letra informada (de acordo com a ordem alfabética) \n");
            System.out.print(" 6 - Quantidade de pontos de exclamação informados \n");
            System.out.print(" 9 - Exit \n");
            System.out.print(" Digite uma das opções acima: \n");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite 10 caracteres diversos: ");
                    for (int i = 0; i < ler.length; i++) {
                        ler[i] = input.nextLine();
                        if (ler[i].equals("#")) {
                            System.out.println(" '#' NÃO É UM CARACTER VALIDO !! ");
                            break;
                        }
                    }
                    break;

                case 2:
                    int qtdAZ = 0;
                    for (int i = 0; i < ler.length; i++) {
                        if (ler[i].equals("A") || ler[i].equals("Z")) {
                            qtdAZ++;
                        }
                    }
                    System.out.println("Existem " + qtdAZ + "letras 'A' e 'Z' maiuscula.");
                    break;

                case 3:
                    int qtdVazio = 0;
                    for (int i = 0; i < ler.length; i++) {
                        if (!ler[i].equals("")) {
                            qtdVazio++;
                        }
                    }
                    System.out.println("Existem " + qtdVazio + " caracteres no vetor.");
                    break;

                case 4:
                    int qtdCons = 0;
                    for (int i = 0; i < ler.length; i++) {
                        if (ler[i].matches("[a-z&&[^aeiou]]") || ler[i].matches("[A-Z&&[^AEIOU]]")) {
                            qtdCons++;
                        }
                    }
                    System.out.println("Existem " + qtdCons + " consoantes no vetor.");
                    break;

                case 5:
                    Arrays.sort(ler);
                    System.out.println(
                            "A maior letra é: " + ler[ler.length - 1] + " ( considerando a ordem alfabética ).");
                    break;

                case 6:
                    int qtdEx = 0;
                    for (int i = 0; i < ler.length; i++) {
                        if (ler[i].equals("!")) {
                            qtdEx++;
                        }
                    }
                    System.out.println("Existem " + qtdEx + " de pontos de excalmação.");
                    break;

                case 9:
                    break;

                default:
                    System.out.print("\n Opção Inválida ! ");
                    break;
            }
        }
    }
}
