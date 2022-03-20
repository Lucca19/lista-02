//---------------------------------------------- ATIVIDADE 4 ----------------------------------------------
import java.util.Scanner;

public class Pesquisa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int posicaoPessoa = 0;
        Pessoa vPessoa[] = new Pessoa[3];
        int opcao = 0;
        while (opcao != 12) {
            exibirOpcoes();
            opcao = input.nextInt();
            exibirListaPessoas(vPessoa);
            switch (opcao) {
                case (1): {
                    // Instancia de pessoa
                    Pessoa pessoa = new Pessoa();

                    System.out.println(" 1 - Para digitar seu sexo: ( Masculino ou Feminino )");
                    String sexo = input.next();
                    pessoa.setSexo(sexo);

                    System.out.println(" 2 - Para digitar a cor dos seus olhos: ( Azul, verde ou castanho )");
                    String olho = input.next();
                    pessoa.setOlho(olho);

                    System.out.println(" 3 - Para digitar a cor do seu cabelo: ( Loiro, castanho ou preto )");
                    String cabelo = input.next();
                    pessoa.setCabelo(cabelo);

                    System.out.println(" 4 - Para digitar a sua idade:");
                    int idade = input.nextInt();
                    pessoa.setIdade(idade);

                    vPessoa[posicaoPessoa] = pessoa;
                    posicaoPessoa++;
                    if (sexo.equals("-1") || olho.equals("-1") || cabelo.equals("-1") || idade == -1) { // Este 'if' ira
                        // quebrar caso
                        // ele enconstre um '-1';
                        break;
                    }
                    break;
                }

                case (2): {
                    int maiorIdadeHab = 0;
                    for (int i = 1; i < vPessoa.length; i++) {
                        if (maiorIdadeHab < vPessoa[i].getIdade()) {
                            maiorIdadeHab = vPessoa[i].getIdade();
                        }
                    }
                    int menorIdadeHab = 0;
                    for (int i = 1; i < vPessoa.length; i++) {
                        if (menorIdadeHab > vPessoa[i].getIdade()) {
                            menorIdadeHab = vPessoa[i].getIdade();
                        }
                    }
                    System.out.println("A menor idade entre os habitantes é de : " + menorIdadeHab + " anos.");
                    System.out.println("A maior idade entre os habitantes é de : " + maiorIdadeHab + " anos.");
                    break;
                }

                case (3): {
                    int maiorIdadeMulheres = 0;
                    for (int i = 1; i < vPessoa.length; i++) {
                        if (
                                vPessoa[i].getSexo().equals("Feminino")
                                        && maiorIdadeMulheres < vPessoa[i].getIdade()
                        ) {
                            maiorIdadeMulheres = vPessoa[i].getIdade();
                        }
                    }

                    System.out.println("A maior idade entre as mulheres é de : " + maiorIdadeMulheres + " anos.");
                    break;
                }

                case (4): {
                    int maiorIdadeHomens = 0;
                    for (int i = 1; i < vPessoa.length; i++) {
                        if (
                                vPessoa[i].getSexo().equals("Masculino")
                                        && maiorIdadeHomens < vPessoa[i].getIdade()
                                        && maiorIdadeHomens < vPessoa[i].getIdade()
                        ) {
                            maiorIdadeHomens = vPessoa[i].getIdade();
                        }
                    }
                    System.out.println("A maior idade entre os homens é de : " + maiorIdadeHomens + " anos.");
                    break;
                }

                case (5): {
                    int numeroMulheres = 0;
                    for (int i = 0; i < vPessoa.length; i++) {
                        if (
                                vPessoa[i].getSexo().equalsIgnoreCase("Feminino")
                                        && vPessoa[i].getIdade() >= 18
                                        && vPessoa[i].getIdade() <= 35
                                        && vPessoa[i].getOlho().equalsIgnoreCase("verde")
                                        && vPessoa[i].getCabelo().equalsIgnoreCase("loiro")
                        ) {
                            numeroMulheres++;
                        }
                    }
                    System.out.println("O numero de mulheres com idade entre 18 e 35 anos, loiras com olhos verde é de: " + numeroMulheres + " mulheres.");
                    break;
                }

                case (6): {
                    double qtdMulheres = 0;
                    double vPessoaD = vPessoa.length;
                    for (int i = 0; i < vPessoa.length; i++) {
                        if (
                                vPessoa[i].getSexo().equalsIgnoreCase("Feminino")
                                        && vPessoa[i].getIdade() >= 18
                                        && vPessoa[i].getIdade() <= 35
                                        && vPessoa[i].getOlho().equalsIgnoreCase("verde")
                                        && vPessoa[i].getCabelo().equalsIgnoreCase("loiro")
                        ) {
                            qtdMulheres++;
                        }
                    }
                    System.out.println("A porcentagem de mulheres com idade entre 18 e 35 anos, loiras com olhos verde é de: " + ((qtdMulheres / vPessoaD) * 100) + "%.");
                    break;
                }

                case (7): {
                    int nHomens = 0;
                    for (int j = 0; j < vPessoa.length; j++) {
                        if (vPessoa[j].getSexo().equalsIgnoreCase("Masculino")
                                && vPessoa[j].getIdade() >= 40
                                && vPessoa[j].getIdade() <= 50
                                && vPessoa[j].getOlho().equalsIgnoreCase("castanho")
                                && vPessoa[j].getCabelo().equalsIgnoreCase("preto")) {

                            nHomens++;

                        }
                    }
                    System.out.println("Existem " + nHomens + " homem(ns) com olhos castanhos e cabelo pretos.");
                    break;
                }

                case (8): {
                    double qtdHomens = 0;
                    double vPessoaD = vPessoa.length;
                    for (int j = 0; j < vPessoa.length; j++) {
                        if (
                                vPessoa[j].getSexo().equalsIgnoreCase("Masculino")
                                        && vPessoa[j].getIdade() >= 40
                                        && vPessoa[j].getIdade() <= 50
                                        && vPessoa[j].getOlho().equalsIgnoreCase("castanho")
                                        && vPessoa[j].getCabelo().equalsIgnoreCase("preto")
                        ) {
                            qtdHomens++;
                        }
                    }
                    System.out.println("A porcentagem de homens com idade entre 40 e 50 anos, de cabelo castanho com olhos pretos: " + ((qtdHomens / vPessoaD) * 100) + "%.");
                    break;
                }

                case (9): {
                    double somaIdades = 0D;
                    for (int j = 0; j < vPessoa.length; j++) {
                        somaIdades = vPessoa[j].getIdade() + somaIdades;
                    }
                    System.out.println("A média das idades é " + (somaIdades / vPessoa.length));
                    break;
                }

                case (10): {
                    int qtdHabitantes = 0;
                    for (Pessoa pessoa : vPessoa) {
                        if (pessoa != null) {
                            qtdHabitantes++;
                        }
                    }
                    System.out.println("O número total de habitantes é de" + qtdHabitantes);
                    break;
                }

                case (11): {
                    System.out.print("\nFim");
                }

                default: {
                    System.out.print("\nESTA OPÇÃO NÃO É VALIDA");
                    break;
                }
            }
        }
    }

    public static void exibirOpcoes() {
        System.out.println("___________________________________________________________________________________________________________________________");
        System.out.println(" 1 - CADASTRAR INFORMAÇÕES");
        System.out.println(" Escolha qual informação voce deseja saber:");
        System.out.println(" 2 - A maior e menor idade dos habitantes");
        System.out.println(" 3 - A maior idade das mulheres");
        System.out.println(" 4 - A maior idade dos homens");
        System.out.println(" 5 - O número de mulheres cuja idade está entre 18 e 35 anos e que tenham olhos verdes e cabelos louros");
        System.out.println(" 6 - A porcentagem de mulheres cuja idade está entre 18 e 35 anos inclusive e que tenham olhos verdes e cabelos louros");
        System.out.println(" 7 - O número de homens cuja idade está entre 40 e 50 anos inclusive e que tenham olhos castanhos e cabelos pretos");
        System.out.println(" 8 - A porcentagem de homens cuja idade está entre 40 e 50 anos inclusive e que tenham olhos castanhos e cabelos pretos");
        System.out.println(" 9 - A média de idade dos habitantes");
        System.out.println(" 10 - O número total de habitantes");
        System.out.println(" 11 - Sair");
        System.out.println("___________________________________________________________________________________________________________________________");
        System.out.println(" Digite uma das opções acima:");
    }

    public static void exibirListaPessoas(Pessoa[] vPessoa) {
        for (Pessoa pessoa : vPessoa) {
            if (pessoa != null) {
                System.out.println(pessoa.toString());
            }
        }
    }
}
