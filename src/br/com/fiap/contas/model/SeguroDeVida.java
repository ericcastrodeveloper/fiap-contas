package br.com.fiap.contas.model;

public class SeguroDeVida implements Tributavel {

    private double valor;
    private String titular;
    private int numeroApolice;

    @Override
    public double getValorImposto() {
        return 0;
    }

    public String getTipo(){
        return "Seguro de Vida";
    }
}
