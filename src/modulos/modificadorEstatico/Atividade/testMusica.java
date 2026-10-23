package modulos.modificadorEstatico.Atividade;

import java.util.Scanner;

public class testMusica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Total inicial: " + Musica.getTotalMusica());


        Musica musica1 = new Musica("", "", 0);

        System.out.println("Digite o titulo : ");
        String titulo = scanner.next();
        musica1.setTitulo(titulo);

        System.out.println("Digite o artista : ");
        String artista = scanner.next();
        musica1.setArtista(artista);

        System.out.println("Tem album ? ");
        System.out.print("S || N : ");
        char opcao = scanner.next().charAt(0);

        if (opcao == 'S' || opcao == 's'){
            System.out.println("Digite o album : ");
            String album = scanner.next();
            musica1.setAlbum(album);
        }

        System.out.println("Digite duracao : ");
        int duracao = scanner.nextInt();
        musica1.setDuracaoSegundos(duracao);

        Musica musica2 = new Musica(
                "Segunda faixa", "Artista B", 245, "Álbum B"
        );

        System.out.println("\n--- Música 1 ---");
        musica1.imprimirDados();

        System.out.println("\n--- Música 2 ---");
        musica2.imprimirDados();

        System.out.println("\nTotal após criar: " + Musica.getTotalMusica());

        musica1.alterarDados("Primeira faixa atualizada", "Artista C");

        System.out.println("\n--- Música 1 após alteração ---");
        musica1.imprimirDados();

        System.out.println("\n--- Música 2 deve continuar igual ---");
        musica2.imprimirDados();

        musica2.alterarDados(
                "Segunda faixa atualizada", "Artista D", "Novo álbum"
        );

        System.out.println("\n--- Música 2 após alteração ---");
        musica2.imprimirDados();

        System.out.println("\n--- Música 1 deve manter seus dados ---");
        musica1.imprimirDados();

        System.out.println("\nTotal final: " + Musica.getTotalMusica());
    }
}