import java.util.Scanner;


public class pesquisa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 0;

        String ler[] = new String[10];

        String vSexo[] = new String[1];
        String vOlhos[] = new String[1];
        String vCabelo[] = new String[1];
        int vIdade[] = new int[1];

        int opcao = 0;
        while (opcao != 9) {
            System.out.print(
                    "_______________________________________________________________________________________________________________ \n");
            System.out.print(" 1 - CADASTRAR INFORMAÇÕES \n");
            System.out.print("\n");
            System.out.print(" Escolha qual informação voce deseja saber: \n");
            System.out.print("\n");
            System.out.print(" 2 - A maior e menor idade dos habitantes \n");
            System.out.print(" 3 - A maior idade das mulheres \n");
            System.out.print(" 4 - A maior idade dos homens \n");
            System.out.print(
                    " 5 - O número de mulheres cuja idade está entre 18 e 35 anos e que tenham olhos verdes e cabelos louros \n");
            System.out.print(
                    " 6 - A porcentagem de mulheres cuja idade está entre 18 e 35 anos inclusive e que tenham olhos verdes e cabelos louros \n");
            System.out.print(
                    " 7 - O número de homens cuja idade está entre 40 e 50 anos inclusive e que tenham olhos castanhos e cabelos pretos \n");
            System.out.print(
                    " 8 - A porcentagem de homens cuja idade está entre 40 e 50 anos inclusive e que tenham olhos castanhos e cabelos pretos \n");
            System.out.print(" 10 - A média de idade dos habitantes \n");
            System.out.print(" 11 - O número total de habitantes \n");
            System.out.print(" 12 - Sair \n");
            System.out.print(
                    "_______________________________________________________________________________________________________________ \n");
            System.out.print("\n");
            System.out.print(" Digite uma das opções acima: \n");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print(" 1 - Para digitar seu sexo: ( Masculino ou Feminino ) \n");
                    String sexo = input.next();
                    vSexo[i] = sexo;

                    System.out.print(" 2 - Para digitar a cor dos seus olhos: ( Azul, verde ou castanho ) \n");
                    String olhos = input.next();
                    vOlhos[i] = olhos;

                    System.out.print(" 3 - Para digitar a cor do seu cabelo: ( Loiro, castanho ou preto) \n");
                    String cabelo = input.next();
                    vCabelo[i] = cabelo;

                    System.out.print(" 4 - Para digitar a sua idade: \n");
                    int idade = input.nextInt();
                    vIdade[i] = idade;

                    if (sexo.equals("-1") || olhos.equals("-1") || cabelo.equals("-1")) { // Este 'if' ira quebrar caso
                                                                                          // ele enconstre um '-1';
                        break;
                    }
                    if (idade == -1) {
                        break;
                    }
                    break;

                case 2:
                    int maior = 0;
                    int menor = 300;
                    for (int j=0; j<vIdade.length-1; j++){ 
                        if(vIdade[j] > maior){
                            maior = vIdade[j];
                        }else if(vIdade[j] < menor){
                            menor = vIdade[j];
                        }
                    }
                    System.out.print("\nA Maior idade entre os habitantes é: " + maior);
                    System.out.print("\nA Menor idade entre os habitantes é: " + menor);
                    break;

                case 3:


                break;

                case 4:

                    break;

                case 5:

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
