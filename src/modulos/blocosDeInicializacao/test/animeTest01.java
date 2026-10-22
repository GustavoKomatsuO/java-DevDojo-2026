package modulos.blocosDeInicializacao.test;

import modulos.blocosDeInicializacao.model.Anime;

public class animeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        for (int episodios : anime.getEpisodio()) {
            System.out.print(episodios + " ");
        }
    }
}
