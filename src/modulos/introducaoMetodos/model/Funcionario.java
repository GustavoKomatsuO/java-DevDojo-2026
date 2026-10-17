package modulos.introducaoMetodos.model;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario = new double[3];
    private double soma = 0;

    public void printDados(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (int i = 0; i < salario.length; i++) {
            System.out.println(salario[i]);
        }
    }

    public void mediaSalario(double... salario){
        for (double num : salario){
            soma += num;
        }
        double media = soma / salario.length;
        System.out.println(media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public double getSoma() {
        return soma;
    }
}
