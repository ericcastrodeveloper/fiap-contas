package br.com.fiap.contas.main;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestePerformance {

    public static void main(String[] args) {

        System.out.println("Iniciando...");
        Collection<Integer> teste = new ArrayList<>();
        long inicio = System.currentTimeMillis();
        int total = 30000;
        for (int i = 0; i < total; i++) {
            teste.add(i);
        }

        tempoGasto(inicio);

        long inicio2 = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            teste.contains(i);
        }

        tempoGasto(inicio2);
    }

    public static void tempoGasto(long inicio){
        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo gasto: " + tempo);
    }
}

