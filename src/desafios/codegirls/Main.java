/**
 *
 * Desafio
 * Escreva um algoritmo que leia 2 valores inteiros A e B.
 * Calcule a soma dos números que não são múltiplos de 13 entre A e B, incluindo ambos.
 *
 * Entrada
 * O arquivo de entrada contém 2 valores inteiros quaisquer, não necessariamente em ordem crescente.
 *
 * Saída
 * Imprima a soma de todos os valores não divisíveis por 13 entre os dois valores lidos na entrada,
 * inclusive ambos se for o caso*
 *
 * Exemplo de entrada
 * n1 100,100,100,137, -127
 * n2 200,101, 80,243, -129
 *
 * Exemplo de Saída
 * soma 13954, 201, 1799, 18822, -384
 */

package desafios.codegirls;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int soma = 0;
        System.out.println("Por gentileza, digite o primeiro número: ");
        int n1 =sc.nextInt();
        System.out.println("Por gentileza, digite o segundo número: ");
        int n2= sc.nextInt();

        if (n1 > n2)
        {
            int aux = n1;
            n1 = n2;
            n2 = aux;
        }

        if (n1 > n2) {
            for (int i = n2; i <= n1; i++) {
                if (i % 13 != 0) soma += i;
            }
        } else {
            for (int i = n1; i <= n2; i++) {
                if (i % 13 != 0) soma += i;
            }
        }

       System.out.println(soma);

       sc.close();

    }

}