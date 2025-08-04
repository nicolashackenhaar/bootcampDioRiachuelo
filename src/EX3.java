//Base e altura do triangulo retorna area

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a base do retangulo");
        var base = scanner.nextDouble();
        System.out.println("Qual a altura do retangulo");
        var altura = scanner.nextDouble();
        var resultado = base * altura;
        System.out.println(resultado);

    }
}
