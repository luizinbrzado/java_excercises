package aula03;

import java.util.Scanner;

public class AtvProf {

    public static int quantosPacotes(float qtd, Scanner ler) {

        float kg = 0.0f;
        int cont = 0;
        System.out.println("Digite o peso do pacote: ");
        while(kg < qtd) {
            String entrAux = ler.nextLine();
            float aux = Float.parseFloat(entrAux);

            kg += aux;
            cont ++;
        }

        return cont;

    }

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome do doguinho: ");
        String nome = ler.nextLine();

        System.out.println("Digite a quantidade de ração em Kg (use vírgula): ");
        String qtdAux = ler.nextLine();
        float qtd = Float.parseFloat(qtdAux); // Convertendo String para Float

        System.out.println("O " + nome + " precisa de " + quantosPacotes(qtd,ler) + " pacotes!");
    }

}
