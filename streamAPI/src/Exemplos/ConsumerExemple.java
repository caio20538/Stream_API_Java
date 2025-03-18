package Exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Operações que recebem um argumento do tipo T e não retornão nenhum resultado.
 * É usado para realizar ações ou efeitos colaterais no Stream sem modificar, ou
 * retornar um valor.
 */
public class ConsumerExemple {
    public static void main(String[] args) {
        //Lista com números inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        System.out.println("Números par");
        // Usar Consumer com expressão Lambda para imprimir números pares
        Consumer<Integer> imprimirPares = numero ->{
            if (numero % 2 == 0){
                System.out.println(numero);
            }
        };

        // Com Stream
        numeros.stream().forEach(imprimirPares);

        System.out.println("Números impar");
        //forma simplificada mas impares (não precisa chamar o stream)
        numeros.forEach(n -> {
                if (n % 2 == 1) System.out.println(n);
            }
        );

        System.out.println();
        System.out.println();

        //mais simples

        numeros.stream()
                .filter(n -> n % 2 ==1)
                .forEach(System.out::println);
    }
}
