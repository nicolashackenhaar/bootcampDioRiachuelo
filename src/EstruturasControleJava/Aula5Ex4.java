package EstruturasControleJava;

import java.util.Scanner;

/*
usuario informa numero
usuario informa N numeros
até o numero informado dividido pelo primeiro numero ter % !=0
ignorar numeros menores que o primeiro

*/
public class Aula5Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu numero principal");
        int num1 = scanner.nextInt();
        int num2 = 1;


        while (num2 < num1 && num2 % num1 != 0) {
            System.out.println("Informe um numero");
            num2 = scanner.nextInt();
        }


    }
}
