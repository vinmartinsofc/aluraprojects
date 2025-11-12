package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.LivroFisico;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NovidadesJava8 {
    static void main() {

        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");

        Livro javaoo = new LivroFisico(autor);
        javaoo.setNome("Java O.O.");

        Livro java8 = new LivroFisico(autor);
        java8.setNome("Java 8 Prático");

        Livro ruby = new LivroFisico(autor);
        ruby.setNome("Livro de Ruby");


        List<Livro> livros = Arrays.asList(javaoo, java8, ruby);


        Collections.sort(livros, new Comparator<Livro>() {

            @Override
            public int compare(Livro o1, Livro o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });

        for (Livro livro : livros) {
            System.out.println(livro.getNome());
        }

        

    }

}
