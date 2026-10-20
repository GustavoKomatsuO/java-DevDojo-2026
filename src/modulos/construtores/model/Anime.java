package modulos.construtores.model;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String categoria;
    private String estudio;

    public Anime(String nome, String tipo, int episodios, String categoria){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.categoria = categoria;
    }

    public Anime(String nome, String tipo, int episodios, String categoria, String estudio){
        this(nome, tipo, episodios, categoria);
        this.estudio = estudio;
    }

    public void init(String nome, String tipo, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    public void init(String nome, String tipo, int episodios, String categoria){
        init(nome,tipo,episodios);
        this.categoria = categoria;
    }

    public void printDados(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.categoria);
        System.out.println(this.estudio);
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome =  nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
}
