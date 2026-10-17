package modulos.introducaoMetodos.test.Funcionario;

import modulos.introducaoMetodos.Exercicios.Funcionario;

import java.util.Scanner;

public class testSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.print("Seu nome : ");
        funcionario.nome = scanner.next();

        System.out.print("Sua idade : ");
        funcionario.idade = scanner.nextInt();

        System.out.print("Diga o 1° salario : ");
        funcionario.salario[0] = scanner.nextDouble();
        System.out.print("Diga o 2° salario : ");
        funcionario.salario[1] = scanner.nextDouble();
        System.out.print("Diga o 3° salario : ");
        funcionario.salario[2] = scanner.nextDouble();

        System.out.println("");
        funcionario.printDados();

        System.out.println("*********************");
        System.out.println("Media :");
        funcionario.mediaSalario(funcionario.salario[0], funcionario.salario[1] , funcionario.salario[2]);
    }
}
