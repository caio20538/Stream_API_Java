package Exemplos;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExemple {

    /**
     * Operação que não aceita argumentos e retorna um resultado do tipo T.
     * Usado para criar ou fornecer novos objetos de um determinado Tipo.
     */

    public static void main(String[] args) {
        // supplier com lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem vindo(a).";

        //obter uma lista com 5 saudações

        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .toList();

        //imprimir
        listaSaudacoes.forEach(s -> System.out.println(s));

        System.out.println();
        System.out.println();


        //forma simplificada
        List<String> listaSausacoes2 = Stream.generate(() -> "Olá, seja bem vindo dnv")
                .limit(5)
                .toList();
        //subistituindo com o método reference
        listaSausacoes2.forEach(System.out::println);
        //
    }

}
