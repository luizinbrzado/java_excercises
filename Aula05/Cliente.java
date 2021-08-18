package Aula05;

import java.util.Scanner;

public class Cliente {
    private int numeroCliente;
    private String nome;
    private double divida;
    public Cliente(int numeroCliente, String nome) {
        this.numeroCliente = numeroCliente;
        this.nome = nome;
        this.divida = 0;
    }

    public int getNumeroCliente() {
        return this.numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDivida() {
        return divida;
    }

    public void setDivida(double divida) {
        this.divida = divida;
    }

    public String aumentarDivida(Double valor) {
        this.divida += valor;
        return "Sua dívida é de "+ this.divida;
    }

    public String pagarDivida() {
        this.divida = 0;
        return "Você pagou sua dívida!";
    }
}