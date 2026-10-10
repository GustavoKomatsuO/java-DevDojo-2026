package modulos.introducaoClasses.Exercicios.Repository;

import modulos.introducaoClasses.Exercicios.Model.Carros;

import java.util.Scanner;

public class AddCarros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carros carro1 = new Carros();
        Carros carro2 = new Carros();

        System.out.print("Digite o nome do carro1 : ");
        carro1.nome = scanner.nextLine();

        System.out.print("Digite o nome do carro2 : ");
        carro2.nome = scanner.nextLine();

        System.out.print("Digite o ano do carro1 : ");
        carro1.ano = scanner.nextInt();

        System.out.print("Digite o ano do carro2 : ");
        carro2.ano = scanner.nextInt();

        System.out.print("Digite o modelo do carro1 : ");
        carro1.modelo = scanner.nextLine();

        System.out.print("Digite o modelo do carro2 : ");
        carro2.modelo = scanner.nextLine();

        System.out.printf("carro 1: %s e carro2: %s",carro1.nome,carro2.nome);


    }
}
