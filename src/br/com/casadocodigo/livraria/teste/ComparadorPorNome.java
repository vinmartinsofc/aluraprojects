package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.produtos.Livro;

import java.util.Comparator;

public class ComparadorPorNome implements Comparator<Livro> {

    @Override
    public int compare(Livro o1, Livro o2) {
        return o1.getNome().compareTo(o2.getNome());
    }



}
