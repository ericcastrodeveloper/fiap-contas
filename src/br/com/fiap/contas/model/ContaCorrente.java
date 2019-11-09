package br.com.fiap.contas.model;

public class ContaCorrente extends Conta implements  Tributavel {

    public void saca(double valor) {
        this.saldo -= (valor + 0.10);
    }

    public String getTipo() {
        return "Conta Corrente";
    }

    @Override
    public double getValorImposto() {
        return this.getSaldo() * 0.01;
    }
}
