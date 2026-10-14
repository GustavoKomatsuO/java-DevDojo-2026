package modulos.introducaoMetodos.test;
import modulos.introducaoMetodos.model.Calculadora;

public class CalculadoraTestDiv {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        double result = calc.divisaoDoisNum(10,1);
        System.out.println(result);

        System.out.println(calc.divisaoDoisNum(0,67));

    }
}
