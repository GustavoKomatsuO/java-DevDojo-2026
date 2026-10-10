package modulos.introducaoMetodos.model;

import java.util.Scanner;

public class Calculadora {

    //metodo nao profissional :
    public void somaDoisNum(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("num 1: ");
        int num1 = scanner.nextInt();

        System.out.print("num 2: ");
        int num2 = scanner.nextInt();

        int soma = num1 + num2;

        System.out.printf("%d + %d = %d\n",num1,num2,soma);
    }

    public void subtracaoDoisNum(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("num 1: ");
        int num1 = scanner.nextInt();

        System.out.print("num 2: ");
        int num2 = scanner.nextInt();

        int subt = num1 - num2;

        System.out.printf("%d - %d = %d",num1,num2, subt);
    }

    public void multiplicacaoDoisNum(int num1, int num2){
        Scanner scanner = new Scanner(System.in);
        int mult = num1 * num2;
        System.out.printf("%d * %d = %d",num1,num2, mult);
    }

    //metodo profissional:
    public double divisaoDoisNum(double num1, double num2){

        return 0;
    }
}
