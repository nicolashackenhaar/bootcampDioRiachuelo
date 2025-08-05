package EstruturasControleJava;

import java.util.Scanner;

/*
o usuario manda um numero
usuario manda um numero maior que o primeiro
usuario escolhe entre a opção par ou impar
sistema informa todos os pares ou impares de acordo com
 a selecao inicial incluindo numeros, em ordem decrescente
*/
public class Aula5Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        int num1 = scanner.nextInt();
        System.out.println("Digite um numero maior que o primeiro");
        int num2 = scanner.nextInt();
        while (num2 <= num1) {
            System.out.println("Digite um numero maior que o primeiro");
            num2 = scanner.nextInt();
        }
        System.out.println("Escolha entre par ou impar");
        boolean isPair = scanner.next().equalsIgnoreCase("par");

        if (isPair == true) {
            for (int i = num2; i >= num1; i--) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            for (int i = num2; i >= num1; i--) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        }

    }
}
