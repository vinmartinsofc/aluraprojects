package br.com.casadocodigo.livraria.teste;

import java.util.HashSet;

public class TestandoPerformance {
    static void main() {

        HashSet<String> colecao = new HashSet<>();

        for (int i = 0; i < 100000; i++) {
            colecao.add("Item: " +i);
        }

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            colecao.contains("Item: " +i);
        }

        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;

        System.out.println("Demorou " + tempo + " MS para executar!");

    }

}
