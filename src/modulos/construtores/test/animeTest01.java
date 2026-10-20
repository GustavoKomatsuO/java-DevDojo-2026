package modulos.construtores.test;

import modulos.construtores.model.Anime;

public class animeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Oshi no ko", "Streaming", 12, "Drama");
        anime.printDados();
    }
}
