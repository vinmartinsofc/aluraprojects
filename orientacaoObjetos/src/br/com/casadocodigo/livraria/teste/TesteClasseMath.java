package br.com.casadocodigo.livraria.teste;

public class TesteClasseMath {
    static void main() {

//        long round = Math.round(3.99);
//        long max = Math.max(100, 10);
//        int min = Math.min(100, 10);
//        int abs = Math.abs(-5);
//        double sqrt = Math.sqrt(4);
//
//        System.out.println(round);
//        System.out.println(max);
//        System.out.println(min);
//        System.out.println(abs);
//        System.out.println(sqrt);

        String a = "Java";

        a.replace("v", "c");

        String novaString = a.replace("v", "c");

        System.out.println(a);
        System.out.println(novaString);



        String ai = "ai";

        String nomeMelhor = ai.replace("a", "macaco");
        String upperCase = nomeMelhor.toUpperCase();
        String toLowerCase = upperCase.toUpperCase();
        String qualONomeDoMacaco = toLowerCase.replace("macaco", "MMMMMMMMMAAAAAAAAAACCCCCCCCCCAAAAAAAAACOOOOOOOOOOOO");

//        char charAt = 'a';
//        char char2 = charAt

        boolean endsWith = nomeMelhor.endsWith("O");





        /*
        String nomeMelhor = java.nomeMelhor("v", "c");
        String upperCase = java.toUpperCase();
        String lowerCase = "JAVA".toLowerCase();
        char charAt = java.charAt(0);
        boolean endsWith = java.endsWith("a");
        boolean startsWith = java.startsWith("s");
        boolean equals = java.equalsIgnoreCase("JAVA");
         */


    }


}
