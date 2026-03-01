package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.produtos.Produto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestesList {
    static void main() {

        List<String> nomes = new ArrayList<>();
        nomes.add("Rodrigo Turini");
        nomes.add("Adriano Almeida");
        nomes.add("Paulo Silveira");

        Collections.sort(nomes);

        System.out.println(nomes);

        CarrinhoDeCompras novoCarrinho = new CarrinhoDeCompras();
        

        System.out.println(novoCarrinho.getProdutos());


    }

}
