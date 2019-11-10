package br.com.fiap.contas.main;

import java.util.LinkedList;
import java.util.List;

public class TestaPerformanceDeAdicionarNaPrimeiraPosicao {

    public static void main(String[] args) {
        System.out.println("Iniciando...");
        long inicio = System.currentTimeMillis();
        // trocar depois por ArrayList
        List<Integer> teste = new LinkedList<>();
        for (int i = 0; i < 30000; i++) {
            teste.add(0, i);
        }

        System.out.println("Tempo Gasto Inserção:");
        tempoGasto(inicio);

        long inicio2 = System.currentTimeMillis();
        for(int i = 0; i < 30000; i++){
            teste.get(0);
        }

        System.out.println("Tempo Gasto Pesquisa:");

        tempoGasto(inicio2);
    }
    public static void tempoGasto(long inicio){
        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo gasto: " + tempo);
    }
}
