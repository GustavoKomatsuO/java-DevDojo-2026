package modulos.introducaoMetodos.test;

import modulos.introducaoMetodos.model.Calculadora;

public class CalculadoraTestSomaArray {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int[] numeros = {1,2,3,4,10};
        calculadora.somaArray(numeros);

        calculadora.somaVarArgs(1,2,3,4,5);
    }
}
