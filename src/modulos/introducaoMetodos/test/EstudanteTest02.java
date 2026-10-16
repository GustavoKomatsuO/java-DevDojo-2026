package modulos.introducaoMetodos.test;

import modulos.introducaoMetodos.model.Estudante;
import modulos.introducaoMetodos.model.PrintEstudante;

import java.util.Scanner;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        PrintEstudante imprimir = new PrintEstudante();


        estudante01.nome = scanner.nextLine();
        estudante01.idade = scanner.nextInt();
        estudante01.sexo = scanner.next().charAt(0);
        scanner.nextLine();
        System.out.println("-----------------------");
        estudante02.nome = scanner.nextLine();
        estudante02.idade = scanner.nextInt();
        estudante02.sexo = scanner.next().charAt(0);

        imprimir.print(estudante01);
        imprimir.print(estudante02);

        estudante01.imprime();
        estudante02.imprime();

    }
}
