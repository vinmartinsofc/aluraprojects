package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.produtos.Produto;

import java.util.ArrayList;

public class CarrinhoDeCompras {
    private double total;
    ArrayList<Produto> produtos = new ArrayList<>();

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<Produto>();

    }

    public void adiciona(Produto produto) {
        this.produtos.add(produto);

    }

    public void remove(int posicao) {
        this.produtos.remove(posicao);
    }

    public double getTotal() {
        return total;
    }


}

