package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.Autor;

public class Teste999 {
    static void main() {

        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");
        Autor autor2 = new Autor();
        autor2.setNome("Rodrigo Turini");
        if (autor.equals(autor2)) {
            System.out.println("Igual");
        } else {
            System.out.println("Diferente");
        }


        System.out.println(autor.getClass().getSimpleName());



    }

}
