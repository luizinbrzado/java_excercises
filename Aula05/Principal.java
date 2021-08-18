package Aula05;

import java.util.Scanner;

public class Principal{
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);

            Cliente cliente1 = new Cliente(1, "Nelson Bestayashi");

            System.out.println("Antes de adicionar divida para o cliente " + cliente1.getNome());
            System.out.println(cliente1.getDivida());
            System.out.println("\n");

            System.out.println("Colocando dívida para o " + cliente1.getNome());
            String dividaAux = ler.nextLine();
            cliente1.aumentarDivida(Double.parseDouble(dividaAux));
            System.out.println(cliente1.getDivida());
            System.out.println("\n");

            System.out.println("Retirar dívida de " + cliente1.getNome() + "? - [1/2]");
            if (ler.nextInt() == 1) {
                cliente1.pagarDivida();
            }
            System.out.println("\n");

            if (cliente1.getDivida() != 0) {
                System.out.println("O " + cliente1.getNome() + " possui R$" + cliente1.getDivida() + " em dívidas!");
            } else {
                System.out.println(cliente1.getNome() + " de número " + cliente1.getNumeroCliente() + " não possui dívidas!");
            }
            System.out.println("\n");

            System.out.println("Mostrando todos os dados do cliente1:");
            System.out.println(cliente1.getNome() + "\n" + cliente1.getNumeroCliente() + "\n" + cliente1.getDivida());
        }
}