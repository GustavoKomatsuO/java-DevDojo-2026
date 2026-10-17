package modulos.sobrecargaMetodos.test;

import modulos.sobrecargaMetodos.model.Anime;

public class animeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("One Piece", "TV", 1200, "Ação");
        anime.printDados();
    }
}
