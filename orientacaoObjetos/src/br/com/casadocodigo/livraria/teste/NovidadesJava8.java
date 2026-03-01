package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.LivroFisico;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

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

        Livro livroComA = new LivroFisico(autor);
        livroComA.setNome("Arte de programar");

        Livro livroComZ = new LivroFisico(autor);
        livroComZ.setNome("Zelo com os estudos");


        List<Livro> livros = Arrays.asList(javaoo, java8, ruby, livroComA, livroComZ);

        Stream<Livro> stream =  livros.stream();

        livros.stream()
                .filter(l -> l.getNome().contains("Java"))
                .forEach(n -> System.out.println(n.getNome()));



//        for (Livro livro : livros) {
//            System.out.println(livro.getNome());
//        }
//


//        livros.sort(comparing(Livro::getNome));

//        livros.sort(comparing(Livro::getNome));

//        livros.forEach(l -> System.out.println(l.getNome()));



//        System.out.println(livros);

//
//        Collections.sort(livros, new Comparator<Livro>() {
//
//            @Override
//            public int compare(Livro o1, Livro o2) {
//                return o1.getNome().compareTo(o2.getNome());
//            }
//        });
//
//
//
//        for (Livro livro : livros) {
//            System.out.println(livro.getNome());
//        }


//        List<Livro> filtrados = new ArrayList<>();


//        for (Livro livro : livros) {
//            if (livro.getNome().contains("Java")) {
//                filtrados.add(livro);
//            }
//        }







//        for (Livro filtrado : filtrados) {
//            System.out.println(filtrado.getNome());
//        }



        }

        

    }


