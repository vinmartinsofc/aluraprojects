package br.com.casadocodigo.livraria.teste;

public class CalculadoraDeEstoque {
    static void main() {
        double livroJava8 =0;
        double livroTDD =0;

        double soma = livroJava8 + livroTDD;

        int contador = 0;

        for (double i = 0; i < 35;i++ ) {
            soma += 59.90;
        }

        System.out.println("O total em estoque é: " + soma);


        if (soma < 150) {
            System.out.println("Seu estoque está muito baixo!");
        } else if (soma >= 2000) {
            System.out.println("Seu estoque está muito alto!");
        } else {
            System.out.println("Seu estoque está bom!");
        }




    }

}
