package modulos.introducaoMetodos.Exercicios;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario = new double[3];

    public void printDados(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (int i = 0; i < salario.length; i++) {
            System.out.println(salario[i]);
        }
    }

    public void mediaSalario(double... salario){
        double soma = 0;
        for (double num : salario){
            soma += num;
        }
        double media = soma / salario.length;
        System.out.println(media);
    }
}
