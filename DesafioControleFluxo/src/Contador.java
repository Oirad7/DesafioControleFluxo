/**
 * Código para desafio de controle de fluxo do bootcamp Santander backend com java 
 * que imprime a quantidade de interações dados dois números, sendo que o segundo número
 *  não pode ser menor que o primeiro, caso isso ocorra é gerada uma execeção
 * do tipo ParametrosInvalidosException
 * 
 * @author Dario Moura
 */

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro número");
        int parametroUm = scanner.nextInt();
        System.out.println("Informe o segundo número");        
        int parametroDois = scanner.nextInt();

        try {
            contar(parametroUm,parametroDois);
        }catch (ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        };
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if( parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        } else {
            int iteracoes = parametroDois - parametroUm;
            for(int x = 1; x <= iteracoes; x++){
                System.out.println("imprimindo o número " + x);
            }
        }
    }
}
