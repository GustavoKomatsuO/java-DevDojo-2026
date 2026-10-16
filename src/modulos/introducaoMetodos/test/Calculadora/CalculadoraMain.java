package modulos.introducaoMetodos.test.Calculadora;

import modulos.introducaoMetodos.model.Calculadora;

import java.util.Scanner;

public class CalculadoraMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculadora calc = new Calculadora();


        System.out.println("1 = +");
        System.out.println("2 = -");
        System.out.println("3 = *");
        System.out.println("4 = /");
        System.out.print("Digite qual operação vai usar : ");
        int operacoesMat = scanner.nextInt();

        switch (operacoesMat){
            case 1 -> calc.somaDoisNum();
            case 2 -> calc.subtracaoDoisNum();
            case 3 -> {
                System.out.print("\nnum 1: ");
                int num1 = scanner.nextInt();

                System.out.print("num 2: ");
                int num2 = scanner.nextInt();

                calc.multiplicacaoDoisNum(num1,num2);
            }
            case 4 -> {
                System.out.print("\nnum 1: ");
                double num1 = scanner.nextInt();

                System.out.print("num 2: ");
                double num2 = scanner.nextInt();

                System.out.printf("%.2f / %.2f = %.2f%n", num1, num2, calc.divisaoDoisNum(num1, num2));
            }
            default -> System.out.println("Digite um num valido");
        }

    }
}
