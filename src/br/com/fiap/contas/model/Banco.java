package br.com.fiap.contas.model;

import br.com.fiap.contas.exception.LimiteMaximoDeContaExeption;

public class Banco {

    private String nome;
    private int numero;
    private Conta[] contas;
    private static int numeroContas;

    public Banco(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
        this.contas = new Conta[10];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Conta[] getContas() {
        return contas;
    }

    public void setContas(Conta[] contas) {
        this.contas = contas;
    }

    public void adiciona(Conta conta){
        if(numeroContas < this.contas.length){

        contas[numeroContas] = conta;
        numeroContas++;
        }else
            throw new LimiteMaximoDeContaExeption(numeroContas);

    }

    public void mostrarContas(){
        for (int i = 0; i < this.contas.length; i++) {
            if(contas[i] != null) {
                System.out.println("Conta na posição " + (i + 1));
                System.out.println(contas[i].toString());
            }
        }

    }
}
