package EstruturasControleJava;

import java.util.Scanner;

public class Aula2SwitchCase {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("informe um numero de 1 a 7");
        var option = scanner.nextInt();
// primeira forma
//        switch (option) {
//            case 1:
//            case 7:
//                System.out.println("final de semana");
//                break;
//            case 2:
//                System.out.println("segunda");
//                break;
//            case 3:
//                System.out.println("terça");
//                break;
//            case 4:
//                System.out.println("quarta");
//                break;
//            case 5:
//                System.out.println("quinta");
//                break;
//            case 6:
//                System.out.println("sexta");
//                break;
//            default:
//                System.out.println("opção invalida");
//        }

        var message = switch (option) {
            case 1, 7 -> {
                var day = option == 1 ? "domingo" : "sabado";
                yield String.format("Hoje é %s, fim de semana", day);
            }
            case 2 -> "segunda";
            case 3 -> "terça";
            case 4 -> "quarta";
            case 5 -> "quinta";
            case 6 -> "sexta";
            default -> "invalido";
        };
        System.out.println(message);

    }
}
