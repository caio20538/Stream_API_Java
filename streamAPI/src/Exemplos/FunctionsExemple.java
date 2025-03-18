package Exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionsExemple {
    /**
     * Uma função que aceita argumento do tipo T e retorna do tipo R.
     * Mapear ou transformar elementos Stream em outros valores ou tipos.
     * percorre por ele todo.
     */

    public static void main(String[] args) {
        //lista
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        //dobrar todos os números
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        List<Integer> numerosDobrados = numeros.stream()
                .map(dobrar)
                .toList();

        //imprimir
        numerosDobrados.forEach(System.out::println);

        System.out.println();
        System.out.println();

        //simplificado
        List<Integer> numerosTriplificados = numeros.stream()
                .map(n -> n*3)
                .toList();
        numerosTriplificados.forEach(System.out::println);

    }
}
