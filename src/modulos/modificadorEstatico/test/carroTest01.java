package modulos.modificadorEstatico.test;

import modulos.modificadorEstatico.model.Carro;

public class carroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Mustang", 300);
        Carro carro2 = new Carro("Ferrari", 320);
        Carro carro3 = new Carro("Fusca", 420);

        Carro.velocidadeLimite = 200;
        carro1.print();
        carro2.print();
        carro3.print();

    }
}
