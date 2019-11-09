package br.com.fiap.contas.main;

import br.com.fiap.contas.model.ContaCorrente;
import br.com.fiap.contas.model.ContaPoupanca;
import br.com.fiap.contas.model.Tributavel;

public class TestaConta {

    public static void main(String[] args) {


        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.deposita(-100);
        System.out.println(contaCorrente.getValorImposto());

        Tributavel t = contaCorrente;
        System.out.println(t.getValorImposto());

        contaCorrente.saca(200);
    }
}
