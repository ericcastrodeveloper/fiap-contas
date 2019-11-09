package br.com.fiap.contas.main;

import br.com.fiap.contas.model.Banco;
import br.com.fiap.contas.model.Conta;
import br.com.fiap.contas.model.ContaCorrente;
import br.com.fiap.contas.model.ContaPoupanca;

public class TestaBanco {

    public static void main(String[] args) {
        Banco banco = new Banco("CaelumBank", 999);

        ContaCorrente c1 = new ContaCorrente();
        c1.setTitular("Batman");
        c1.setNumero(1);
        c1.setAgencia("1000");
        c1.deposita(100000);
        banco.adiciona(c1);

        ContaPoupanca c2 = new ContaPoupanca();
        c2.setTitular("Robin");
        c2.setNumero(2);
        c2.setAgencia("2000");
        c2.deposita(200000);
        banco.adiciona(c2);

        ContaCorrente c3 = new ContaCorrente();
        c3.setTitular("Mulher Maravilha");
        c3.setNumero(3);
        c3.setAgencia("3000");
        c3.deposita(300000);
        banco.adiciona(c3);

        ContaPoupanca c4 = new ContaPoupanca();
        c4.setTitular("Superman");
        c4.setNumero(4);
        c4.setAgencia("4000");
        c4.deposita(400000);
        banco.adiciona(c4);

        adicionarContas(banco);

        banco.mostrarContas();


    }

    private static void adicionarContas(Banco banco) {

        for(int i = 0; i < 6; i++){
            ContaCorrente conta = new ContaCorrente();
            conta.setTitular("Titular "+i);
            conta.setNumero(i);
            conta.setAgencia("1000");
            conta.deposita(i * 1000);
            banco.adiciona(conta);
        }
    }
}
