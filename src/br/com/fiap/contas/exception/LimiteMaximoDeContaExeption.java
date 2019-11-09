package br.com.fiap.contas.exception;

public class LimiteMaximoDeContaExeption extends RuntimeException{

    public LimiteMaximoDeContaExeption(int numeroContas){
        super("Limite máximo de contas atingido: "+ numeroContas);
    }
}
