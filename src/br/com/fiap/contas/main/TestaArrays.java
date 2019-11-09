package br.com.fiap.contas.main;

import br.com.fiap.contas.model.Conta;
import br.com.fiap.contas.model.ContaCorrente;

public class TestaArrays {

    public static void main(String[] args) {
        Conta[] contas = new Conta[10];

        double soma = 0;

        for(int i = 0; i < contas.length; i++){
            Conta conta = new ContaCorrente();
            conta.deposita(i * 100.00);
            contas[i] = conta;
            System.out.println(conta.getSaldo());
        }

        for(int i = 0; i < contas.length; i++){
            soma += contas[i].getSaldo();
        }
        System.out.println("Soma: "+ soma);
        double media = soma / 10;

        System.out.println("Media: "+media);

    }

}
