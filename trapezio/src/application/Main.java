package application;
import entities.Trapezio;

import java.util.Scanner;



public class Main {

    public static void main (String [] args){

         Scanner scanner  = new Scanner(System.in);
        Trapezio trap1 = new Trapezio();
        Trapezio trap2 = new Trapezio();


        System.out.printf("diga qual será a altura");
        trap1.altura = scanner.nextDouble();
        System.out.printf("diga qual será a base maior");
        trap1.baseMaior = scanner.nextDouble();
        System.out.printf("Digite qual será a base menor");
        trap1.baseMenor = scanner.nextDouble();


        System.out.printf("diga qual será a altura");
        trap2.altura = scanner.nextDouble();
        System.out.printf("diga qual será a base maior");
        trap2.baseMaior = scanner.nextDouble();
        System.out.printf("Digite qual será a base menor");
        trap2.baseMenor = scanner.nextDouble();

        if (trap1.area() > trap2.area()){
            System.out.printf("A area do Trapezio-1 é igual a %.2f e ela é maior do que o Trapezio", trap1.area());

        }else {
            System.out.printf("A area do Trapezio-2 é igual a %.2f e ela é maior que o Trapezio", trap2.area());

        }
        System.out.printf("A 1º área é igual a: %.2f", trap1.area());
        System.out.printf("A 2º área é igual a: %2f", trap2.area());

    }
}

