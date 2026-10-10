package modulos.introducaoClasses.test;

import modulos.introducaoClasses.model.Professor;

import java.util.Scanner;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Professor prof = new Professor();

        System.out.println("Nome : ");
        prof.nome = scanner.nextLine();

        System.out.println("Idade : ");
        prof.idade = scanner.nextInt();

        System.out.println("Sexo : ");
        prof.sexo = scanner.next().charAt(0);

        System.out.printf("Bem vindo %s",prof.nome);


    }
}
