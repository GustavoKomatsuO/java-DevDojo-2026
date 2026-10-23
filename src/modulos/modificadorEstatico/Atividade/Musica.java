package modulos.modificadorEstatico.Atividade;

public class Musica {
    private String titulo;
    private String artista;
    private int duracaoSegundos;
    private String album;
    private static int totalMusica;

    public void imprimirDados(){
        System.out.println(this.titulo);
        System.out.println(this.artista);
        System.out.println(this.album);
        System.out.println(Musica.formatarDuracao(this.duracaoSegundos));
    }

    public Musica(String titulo, String artista, int duracaoSegundos){
        this.titulo = titulo;
        this.artista = artista;
        this.duracaoSegundos = duracaoSegundos;
        this.album = "Single";
        Musica.totalMusica += 1;
    }
    public Musica(String titulo, String artista, int duracaoSegundos, String album){
        this(titulo, artista, duracaoSegundos);
        this.album = album;
    }

    public void alterarDados(String titulo, String artista){
        this.titulo = titulo;
        this.artista = artista;
    }

    public void alterarDados(String titulo, String artista, String album){
        alterarDados(titulo,artista);
        this.album = album;
    }

    public static String formatarDuracao(int segundos){
        int minutos = segundos / 60;
        int segundosRestantes = segundos % 60;
        String formatado = (minutos+":"+segundosRestantes);
        if (segundosRestantes < 10){
            formatado = (minutos+":"+"0"+segundosRestantes);
        }

        return formatado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracaoSegundos() {
        return duracaoSegundos;
    }

    public void setDuracaoSegundos(int duracaoSegundos) {
        this.duracaoSegundos = duracaoSegundos;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public static int getTotalMusica() {
        return totalMusica;
    }


}
