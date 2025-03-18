package Exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    /**
     * combina 2 argumentos do tipo T e retorna do mesmo tipo.
     * Redução de pares de elementos, somar números ou combinar objetos
     */

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        BinaryOperator<Integer> somar = (num1, num2) -> num1+num2;

        //identity é uma variável temporária para um loop
        int resultado = numeros.stream()
                .reduce(0, somar);

        System.out.println("a soma é : " +resultado);

        //simplificado
        int somar2 = numeros.stream()
                .reduce(0, (n1, n2) -> n1+n2);

        System.out.println("a soma é : " +somar2);

        //mais simples
        int somar3 = numeros.stream()
                .reduce(0, Integer::sum);

        System.out.println("a soma é : " +somar3);
    }
}
