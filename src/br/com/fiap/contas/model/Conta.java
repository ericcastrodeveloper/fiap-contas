package br.com.fiap.contas.model;

import br.com.fiap.contas.exception.SaldoInsuficienteException;

public abstract class Conta implements Comparable<Conta> {

    double saldo;
    String titular;
    int numero;
    String agencia;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipo(){
        return "Conta";
    }

    public void saca(double valor){
        if(valor < 0){
            throw new IllegalArgumentException("Você tentou sacar um valor negativo");
        }else if(this.saldo < valor){
            throw new SaldoInsuficienteException(valor);
        }else
            this.saldo += valor;
    }

    public void deposita(double valor){
        if(valor < 0){
            throw new IllegalArgumentException("Você tentou depositar um valor negativo");
        }else
        this.saldo += valor;
    }

    public void transfere(double valor, Conta conta){
        this.saca(valor);
        conta.deposita(valor);
    }
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }

        Conta outraConta = (Conta) obj;

        return this.numero == outraConta.numero && this.agencia.equals(outraConta.agencia);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                ", titular='" + titular + '\'' +
                ", numero=" + numero +
                ", agencia='" + agencia + '\'' +
                '}';
    }

    @Override
    public int compareTo(Conta outraConta) {
        return this.titular.compareTo(outraConta.titular);
    }
}
