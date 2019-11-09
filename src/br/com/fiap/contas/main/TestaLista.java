package br.com.fiap.contas.main;

import br.com.fiap.contas.model.Conta;
import br.com.fiap.contas.model.ContaCorrente;
import br.com.fiap.contas.model.ContaPoupanca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestaLista {

    public static void main(String[] args) {

        ContaCorrente c1 = new ContaCorrente();
        c1.setTitular("Batman");
        c1.setNumero(1);
        c1.setAgencia("1000");
        c1.deposita(100000);

        ContaPoupanca c2 = new ContaPoupanca();
        c2.setTitular("Robin");
        c2.setNumero(2);
        c2.setAgencia("2000");
        c2.deposita(200000);

        ContaCorrente c3 = new ContaCorrente();
        c3.setTitular("Mulher Maravilha");
        c3.setNumero(3);
        c3.setAgencia("3000");
        c3.deposita(300000);

        ContaPoupanca c4 = new ContaPoupanca();
        c4.setTitular("Superman");
        c4.setNumero(4);
        c4.setAgencia("4000");
        c4.deposita(400000);

        List<Conta> contas = new LinkedList<>();
        contas.add(c1);
        contas.add(c2);
        contas.add(c3);
        contas.add(c4);

        Collections.sort(contas);

        System.out.println();
        System.out.println("Imprimir contas ordenadas!");
        imprimirLista(contas);

        System.out.println(contas);
    }
    private static void imprimirLista(List<Conta> contas) {
        for(Conta conta : contas){
            System.out.println(conta.getTitular());
        }
    }
}
