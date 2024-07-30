import java.util.Scanner;
public class idade {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("descubra o ano de nascimento");
        System.out.println("Digite o ano que você nasceu?");
        int anoNascimento = scanner.nextInt();
        System.out.println("em que ano estamos?");
        int anoAtual = scanner.nextInt();
        int idade = anoAtual + anoNascimento;
        System.out.println("sua idade e" + idade);

    }


}
