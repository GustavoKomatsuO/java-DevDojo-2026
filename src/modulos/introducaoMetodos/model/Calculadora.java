package modulos.introducaoMetodos.model;

import java.util.Scanner;

public class Calculadora {

    //metodo sem retorno :
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
        int mult = num1 * num2;
        System.out.printf("%d * %d = %d",num1,num2, mult);
    }

    public void alteraDoisNum(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro alteraDoisNum");
        System.out.println("Num1 "+num1);
        System.out.println("Num2 "+num2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }
    //metodo retorno :
    public double divisaoDoisNum(double num1, double num2){
        if (num2 == 0){
            return 0;
        } else if (num1 == 67 || num2 == 67) {
            return 676776676.676767;        }
        return num1/num2;
    }
}
