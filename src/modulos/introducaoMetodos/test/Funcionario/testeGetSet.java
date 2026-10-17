package modulos.introducaoMetodos.test.Funcionario;

import modulos.introducaoMetodos.model.Funcionario;

public class testeGetSet {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Teste");
        funcionario.setIdade(18);
        funcionario.setSalario(new double[]{1200, 2000, 1000});

        funcionario.printDados();
    }
}
