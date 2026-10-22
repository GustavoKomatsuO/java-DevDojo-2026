package modulos.blocosDeInicializacao.model;

public class Anime {
    private String nome;
    private int[] episodio;

    //Bloco inicialização
    {
        System.out.println("Bloco de inicialização");
        episodio = new int[100];
        for (int i = 0; i < episodio.length; i++) {
            episodio[i] = i+1;
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodio() {
        return episodio;
    }

    public Anime (String nome){
        this.nome = nome;
    }

    public Anime() {
        for (int episodio: this.episodio) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }
}
