import java.util.Scanner;

public class Teperatura {
   static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double reamur;
        double kelvin;
        double fahrenheit;
        double rankine;

        System.out.println("digite a temperatura que você gostaria de converter");
        int a = scanner.nextInt();

        fahrenheit = (a * 9/ 5) + 32;

        kelvin = a + 273;

        reamur = a * 4 / 5;

        rankine = a * 4 / 5;

        System.out.println("Conversação dos Graus celsius em fahrenheit é" + fahrenheit);
        System.out.println("Conversação dos Graus celsius em kelvin é " + kelvin);
        System.out.println("Conversação dos Graus celsius em reamur" + reamur);
        System.out.println("Conversação dos Graus celsius em rankine" + rankine);

        scanner.close();


    }
}
