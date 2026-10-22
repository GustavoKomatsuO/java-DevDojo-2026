package modulos.modificadorEstatico.model;

public class Anime {
    private static String nome;
    private static int[] episodio;

    //Bloco inicialização
    static {
        System.out.println("Bloco de inicialização");
        episodio = new int[100];
        for (int i = 0; i < episodio.length; i++) {
            episodio[i] = i+1;
        }
    }

    public void print(){
        System.out.println(Anime.nome);
    }

    public static void setNome(String nome){
        Anime.nome = nome;
    }

    public static String getNome(){
        return nome;
    }

    public int[] getEpisodio() {
        return episodio;
    }

    public Anime(String nome){
        Anime.nome = nome;
    }

    public Anime() {
        for (int episodio: Anime.episodio) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }
}
