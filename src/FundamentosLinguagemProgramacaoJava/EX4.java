package FundamentosLinguagemProgramacaoJava;//RECEBA 2 IDADES E RETORNA DIFERENÇA

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a idade da pessoa 1");
        var pessoa1 = scanner.nextDouble();
        System.out.println("Qual a idade da pessoa 2");
        var pessoa2 = scanner.nextDouble();
        var diferenca = pessoa1 - pessoa2;

        System.out.println(diferenca);

    }
}