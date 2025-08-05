package EstruturasControleJava;

import java.util.Scanner;

public class Aula5Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero entre 1 e 10.");
        int num = scanner.nextInt();
        System.out.println(num);
        if (num > 10 || num <= 0) {
            System.out.println("Digite um numero entre 1 e 10");
            num = scanner.nextInt();
        }
        for (int i = 1; i <= 10; i++) {
            int temp = num * i;
            System.out.println(num + " x " + i + " = " + temp);


        }
    }
}
