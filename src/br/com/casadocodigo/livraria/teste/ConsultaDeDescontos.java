package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.produtos.GerenciadorDeCupons;

public class ConsultaDeDescontos {
    static void main() {

        GerenciadorDeCupons gerenciador = new GerenciadorDeCupons();


//        if (gerenciador.validaCupom("CUP1234")) {
//            System.out.println("Cupom de desconto válido. ");
//
//        } else {
//            System.out.println("Esse cupom não existe. ");
//        }

        Double desconto = gerenciador.validaCupom("cab11");

        if  (desconto != null)  {
            System.out.println("Cupom válido");
            System.out.println("valor: " + desconto);
        } else {
            System.out.println("Esse cupom não existe.");
        }



//        HashSet<String> set = new HashSet<String>();
//        set.add("Não há repeticão em Conjuntos");
//        set.add("Não há repeticão em Conjuntos");
//        set.add("Não há repeticão em Conjuntos");
//        set.add("Não há repeticão em Conjuntos");
//        set.add("Não há repeticão em Conjuntos");
//        System.out.println(set.size());

    }

}
