package modulos.introducaoMetodos.test.Pessoa;

import modulos.introducaoMetodos.model.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Sla");
        pessoa.setIdade(18);

        //pessoa.printPessoa();

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
