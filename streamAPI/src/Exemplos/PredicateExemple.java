package Exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExemple {
    /**
     * Uma função que recebe um argumento do tipo T e retorna um booleano.
     * Filtrar elementos Stream com base em algm condição.
     */

    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Java", "Kotlin", "Python", "C#", "C", "GO");

        //predicator verifica se a palavra tem + de 5 caracter
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() >5;

        //usar o stream e imprimir
        palavras.stream()
                .filter(maisDeCincoCaracteres)
                .forEach(System.out::println);

        //simplificado
        palavras.stream()
                .filter(p -> p.length() < 5)
                .forEach(System.out::println);
    }


}
