package modulos.introducaoBasicoExercicios.loops;
import java.util.Scanner;

public class senha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua senha : ");
        int senha = scanner.nextInt();

        for (int i = 1; i < 4; i++) {

            System.out.print("Confirme sua senha: ");
            int Csenha = scanner.nextInt();


            if(Csenha != senha && i < 3){
                System.out.println("Tente novamente");
            }
            else if(Csenha == senha){
                System.out.println("Bem vindo");
                break;
            }

            if(i == 3){
                System.out.println("tentativas acabaram tente depois");
            }
        }
        scanner.close();
    }
}
