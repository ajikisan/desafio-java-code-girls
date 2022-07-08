/**
 *
 * O objetivo deste desafio é resolvê-lo utilizando o seu conhecimento sobre Arrays, uma estrutura de dados
 * que armazena uma coleção de dados em um bloco de memória.
 *
 * Desenvolva um programa que guarde em um vetor nomes de funcionários de uma empresa.  Deve-se permitir que,
 * ao indicar o índice do vetor, seja indicado qual funcionário está armazenado dentro dessa memória.
 * Primeira Entrada
 * Mirian
 * Luciana
 * Elisangela
 * Regina
 * Olaf
 *
 * Escolher 1 índice de 0 a 4
 *
 */

package desafios.codegirls;
// Abaixo segue um exemplo de código que você pode ou não utilizar

import java.io.IOException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws IOException {

        System.out.println("Por gentileza digite cinco nomes");
        Scanner input = new Scanner(System.in);
        String[] nomes = new String[5];
        for (int i = 0; i < nomes.length; i++)
        {
            nomes[i] = input.nextLine();
        }
        System.out.println("Descubra o nome, digite um número de 0 a 4");

        int pos = input.nextInt();
        System.out.println("Índice selecionado: " + nomes[pos]);
    }
}

/**
 * Por gentileza digite cinco nomes
 * Mirian
 * Luciana
 * Elisangela
 * Regina
 * Olaf
 * Descubra o nome, digite um número de 0 a 4
 * 0
 * Índice selecionado: Mirian
 *
 * Process finished with exit code 0
 */