package aula03;

import java.util.Scanner;

public class jokenpo {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Jogador 1: ");
        String jogador1 = ler.nextLine();

        System.out.println("Jogador 2: ");
        String jogador2 = ler.nextLine();

        System.out.println("""
                Lembrando:
                1 - Pedra
                2 - Papel
                3 - Tesoura
                """);

        System.out.println("Escolha " + jogador1);
        int escolha1 = ler.nextInt();

        System.out.println("Escolha " + jogador2);
        int escolha2 = ler.nextInt();

        if (Vencedor(escolha1, escolha2) == 0) {
            System.out.println("Deu empate!");
        } else if (Vencedor(escolha1, escolha2) == 1) {
            System.out.println(jogador1 + " ganhou!");
        } else {
            System.out.println(jogador2 + " ganhou!");
        }
    }

    public static int Vencedor(int escolha1, int escolha2) {
        int ganhador = 0;
        if(escolha1 == escolha2) {
            ganhador = 0;
        } else {
            switch (escolha1) {
                case 1:
                    if (escolha2 == 2) ganhador = 2;
                    else if (escolha2 == 3) ganhador = 1;
                    break;
                case 2:
                    if (escolha2 == 1) ganhador = 2;
                    else if (escolha2 == 3) ganhador = 1;
                    break;
                case 3:
                    if (escolha2 == 1) ganhador = 1;
                    else if (escolha2 == 2) ganhador = 2;
                    break;
                default:
                    ganhador = 3;
            }
        }
        return ganhador;
    }
}
