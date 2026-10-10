package modulos.introducaoBasicoExercicios.condicional;

import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1 a 7 : ");
        int dia = scanner.nextInt();

        while(dia < 1 || dia > 7 ){
            System.out.println("Apenas de 1 a 7");
            System.out.print("1 a 7 : ");
            dia = scanner.nextInt();
        }

        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("terca");
                break;
            case 4:
                System.out.println("Seda");
                break;
            case 5:
                System.out.println("Dmingo");
                break;
            case 6:
                System.out.println("egunda");
                break;
            case 7:
                System.out.println("ngo");
                break;
        }
    }
}
