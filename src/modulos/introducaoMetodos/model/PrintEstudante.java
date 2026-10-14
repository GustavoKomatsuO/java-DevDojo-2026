package modulos.introducaoMetodos.model;

public class PrintEstudante {
    public void print(Estudante estudante){
        System.out.println("-------------------");
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
