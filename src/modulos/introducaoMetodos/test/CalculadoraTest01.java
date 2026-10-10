package modulos.introducaoMetodos.test;

import modulos.introducaoMetodos.model.Calculadora;

import java.util.Scanner;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculadora calc = new Calculadora();

        System.out.println("Digite qual operação vai usar : \n");
        System.out.println("1 = +");
        System.out.println("2 = -");
        System.out.println("3 = *");
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
            default -> System.out.println("Digite um num valido");
        }

    }
}
