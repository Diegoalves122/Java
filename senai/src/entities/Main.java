package entities;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Curso java = new Curso();

        System.out.println("Digite o nome do curso");
        java.setNome(sc.nextLine());


        System.out.println("Digite a quantidade de alunos");
        java.getQuantidadeAlunos();
        sc.nextLine();

        System.out.printf("Digite o preco do curso: R$");
        java.setPreco(sc.nextDouble());
        sc.nextLine();

        System.out.printf("O valor total do curso é R$%.2f", java.totalValorCurso());



    }
}
