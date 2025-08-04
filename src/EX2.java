//Escreva um codigo que receba o tamanho do lado de um quadrado e calcule a area.


import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o tamanho do lado do quadrado?");
        var ladoQuadrado = scanner.nextDouble();
        System.out.println("A area do quadrado é: " + ladoQuadrado * ladoQuadrado);
    }
}
