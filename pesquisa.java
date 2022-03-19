import java.util.Scanner;

public class Pesquisa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int posicaoPessoa = 0;
        Pessoa vPessoa[] = new Pessoa[3];
        int opcao = 0;
        while (opcao != 9) {
            System.out.println("_______________________________________________________________________________________________________________");
            System.out.println(" 1 - CADASTRAR INFORMAÇÕES");
            System.out.println(" Escolha qual informação voce deseja saber:");
            System.out.println(" 2 - A maior e menor idade dos habitantes");
            System.out.println(" 3 - A maior idade das mulheres");
            System.out.println(" 4 - A maior idade dos homens");
            System.out.println(" 5 - O número de mulheres cuja idade está entre 18 e 35 anos e que tenham olhos verdes e cabelos louros");
            System.out.println(" 6 - A porcentagem de mulheres cuja idade está entre 18 e 35 anos inclusive e que tenham olhos verdes e cabelos louros");
            System.out.println(" 7 - O número de homens cuja idade está entre 40 e 50 anos inclusive e que tenham olhos castanhos e cabelos pretos");
            System.out.println(" 8 - A porcentagem de homens cuja idade está entre 40 e 50 anos inclusive e que tenham olhos castanhos e cabelos pretos");
            System.out.println(" 10 - A média de idade dos habitantes");
            System.out.println(" 11 - O número total de habitantes");
            System.out.println(" 12 - Sair");
            System.out.println("_______________________________________________________________________________________________________________");
            System.out.println(" Digite uma das opções acima:");
            opcao = input.nextInt();

            switch (opcao) {
                case (0): {
                    for (Pessoa pessoa : vPessoa) {
                        if (pessoa != null) {
                            System.out.println(pessoa.toString());
                        } else {
                            System.out.println("null");
                        }
                    }
                    break;
                }
                case (1): {
                    //Instancia de pessoa
                    Pessoa pessoa = new Pessoa();

                    System.out.println(" 1 - Para digitar seu sexo: ( Masculino ou Feminino )");
                    String sexo = input.next();
                    pessoa.setSexo(sexo);
                    

                    System.out.println(" 2 - Para digitar a cor dos seus olhos: ( Azul, verde ou castanho )");
                    String olho = input.next();
                    pessoa.setOlho(olho);

                    System.out.println(" 3 - Para digitar a cor do seu cabelo: ( Loiro, castanho ou preto)");
                    String cabelo = input.next();
                    pessoa.setCabelo(cabelo);

                    System.out.println(" 4 - Para digitar a sua idade:");
                    int idade = input.nextInt();
                    pessoa.setIdade(idade);

                    vPessoa[posicaoPessoa] = pessoa;
                    posicaoPessoa++;
                    
                    if (sexo.equals("-1") || olho.equals("-1") || cabelo.equals("-1") || idade == -1) { // Este 'if' ira quebrar caso
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
                        if (vPessoa[i].getSexo().equals("Feminino") && maiorIdadeMulheres < vPessoa[i].getIdade()) {
                            maiorIdadeMulheres = vPessoa[i].getIdade();
                        }
                    }

                    System.out.println("A maior idade entre as mulheres é de : " + maiorIdadeMulheres + " anos.");
                    break;
                }
                case (4): {
                    int maiorIdadeHomens = 0;
                    for (int i = 1; i < vPessoa.length; i++) {
                        if (vPessoa[i].getSexo().equals("Masculino") && maiorIdadeHomens < vPessoa[i].getIdade()) {
                            if (maiorIdadeHomens < vPessoa[i].getIdade()) {
                                maiorIdadeHomens = vPessoa[i].getIdade();
                            }
                        }
                    }

                    System.out.println("A maior idade entre os homens é de : " + maiorIdadeHomens + " anos.");
                    break;
                }

                case 5:
                    int mediaIdademulheres = 0;
                    for (int i = 1; i < vPessoa.length; i++) {
                        if (vPessoa[i].getSexo().equals("Feminino") && vPessoa[i].getIdade() >= 18 && vPessoa[i].getIdade() <= 35) {
                            if (vPessoa[i].getOlho().equals("verde") && vPessoa[i].getCabelo().equals("loiro")) {
                                    mediaIdademulheres = mediaIdademulheres + 1;
                            }
                        }
                    }
                    System.out.println(mediaIdademulheres);

                    break;

                case 6:

                    break;

                case 7:

                    break;

                case 8:

                    break;

                case 9:

                    break;

                case 10:

                    break;

                case 11:

                    break;

                case 12:

                    break;

                case 13:

                    break;

                default:

                    break;
            }
        }
    }
}
