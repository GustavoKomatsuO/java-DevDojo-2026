package modulos.introducaoClasses.test;

import modulos.introducaoClasses.model.Estudante;

import java.util.Scanner;

public class PessoaTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Estudante ensino_medio = new Estudante();
        Estudante universitario = new Estudante();

        System.out.println("Diga seu nome : ");
        ensino_medio.nome = scanner.nextLine();

        System.out.println("Diga seu nome : ");
        universitario.nome = scanner.nextLine();

        System.out.println("Diga sua idade em : ");
        ensino_medio.idade = scanner.nextInt();

       while (ensino_medio.idade >= 18){
            System.out.println("Vai ter que fazer o eja ein\n");
            System.out.println("Digite uma menor que 18: ");
            ensino_medio.idade = scanner.nextInt();
        }

        System.out.println("Diga sua idade Un: ");
        universitario.idade = scanner.nextInt();
       while (universitario.idade <18){
           System.out.println("Pode nao fi\n");
           System.out.println("Digite uma maior que 18: ");
           universitario.idade = scanner.nextInt();
       }

        System.out.println("Diga seu sexo (M/F): ");
        ensino_medio.sexo =  Character.toUpperCase(scanner.next().charAt(0));

        while (ensino_medio.sexo != 'M' && ensino_medio.sexo != 'F'){
            System.out.println("Diga seu sexo (M/F): ");
            ensino_medio.sexo =  Character.toUpperCase(scanner.next().charAt(0));
        }
        System.out.println("Bem vindo");

    }
}
