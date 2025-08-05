package EstruturasControleJava;

import java.util.Scanner;

public class Aula5Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua altura em centimetros (ex: 180):");
        double alturaCentimetros = scanner.nextDouble();
        alturaCentimetros = alturaCentimetros / 100;
        System.out.println("Digite seu peso em kilos (ex: 76,5):");
        double pesoKilos = scanner.nextDouble();
        double imc = pesoKilos / (alturaCentimetros * alturaCentimetros);
        String message;
        if (imc <= 18.5) {
            message = "Abaixo do peso";
        } else if (imc <= 24.9) {
            message = "Peso ideal";
        } else if (imc <= 29.9) {
            message = "Levemente acima do peso";
        } else if (imc <= 34.9) {
            message = "Obesidade grau 1";
        } else if (imc <= 39.9) {
            message = "Obesidade grau 2(Severa)";
        } else {
            message = "Obesidade grau 3 (Mórbida)";
        }
        System.out.println(message);
    }
}
