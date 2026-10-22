package modulos.modificadorEstatico.test;

import modulos.modificadorEstatico.model.Anime;

public class animeTest01 {
    public static void main(String[] args) {

        Anime anime1 = new Anime("One Piece");
        Anime anime2 = new Anime();
        Anime anime3 = new Anime();

        anime1.print();
    }
}
