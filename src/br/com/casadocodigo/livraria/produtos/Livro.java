package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;

public abstract class Livro implements Produto {
   private String nome;
   private String descricao;
   private double valor;
   private String isbn;
   private Autor autor;
   private boolean impresso;

    public Livro(Autor autor) {
        this();
        this.autor = autor;
        this.impresso = true;
    }

    public Livro() {

//        if(autor == null) {
//            throw new AutorNuloException("O autor de livro não pode ser nulo");
//        }

        this.isbn = "000-000-000-000";
    }

    @Override
    public int compareTo(Produto outro) {
        if (this.getValor() < outro.getValor()) {
            return -1;
        }

        if (this.getValor() > outro.getValor()) {
            return 1;
        }

        return 0;
    }

    boolean temAutorOuNao() {
        return this.autor != null;
    }


     public void mostrarDetalhes() {
        System.out.println("Mostrando mensagem do livro");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        System.out.println("---");
    }

    @Override
    public String toString() {
        System.out.println("Mostrando mensagem do livro");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        System.out.println("---");
        return null;
    }


    public abstract boolean aplicaDescontoDe(double porcentagem);


    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }


}
