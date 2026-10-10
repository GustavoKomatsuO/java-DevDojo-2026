package modulos.introducaoBasicoExercicios.condicional;

import java.util.Scanner;

public class salarioImposto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu salario anual : ");
        float salario = scanner.nextFloat();

        if(salario > 34712 && salario < 68508){
            float salarioTaxado = salario - (salario * 0.3735f);
            System.out.printf("Salario anual com taxa = %.2f",salarioTaxado);
        }
        else if(salario >= 68508){
            float salarioTaxado = salario - (salario * 0.4950f);
            System.out.printf("Salario anual com taxa = %.2f",salarioTaxado);
        }
        else{
            float salarioTaxado = salario - (salario * 0.0970f);
            System.out.printf("Salario anual com taxa = %.2f",salarioTaxado);
        }
        scanner.close();
    }
}
