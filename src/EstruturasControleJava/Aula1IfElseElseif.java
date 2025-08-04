package EstruturasControleJava;

import java.util.Scanner;

public class Aula1IfElseElseif {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe seu nome:");
        var name = scanner.next();
        System.out.println("Informe sua idade;");
        var age = scanner.nextInt();
        Boolean isEmancipated = null;

        if (age >= 16 && age < 18) {
            System.out.println("Você é emancipado? (s/n)");
            isEmancipated = scanner.next().equalsIgnoreCase("s");
        }
        if ((age >= 18) || (age >= 16 && isEmancipated)) {
            System.out.printf("%s, você pode dirigir \n", name);
        } else System.out.println("Você não pode dirigir!");
    }
}
