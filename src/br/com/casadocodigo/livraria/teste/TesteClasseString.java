package br.com.casadocodigo.livraria.teste;

public class TesteClasseString {
    static void main() {

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

        System.out.println(qualONomeDoMacaco);

        boolean endsWith = nomeMelhor.endsWith("O");
        boolean endsWith2 = nomeMelhor.endsWith("I");
        boolean startsWith = nomeMelhor.startsWith("M");
        boolean equals = nomeMelhor.equalsIgnoreCase("MACACOI");

        System.out.println(endsWith2);
        System.out.println(endsWith);
        System.out.println(startsWith);
        System.out.println(equals);

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
