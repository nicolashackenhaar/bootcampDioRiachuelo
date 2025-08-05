package EstruturasControleJava;

import java.util.Scanner;

public class Aula4RepeticaoWhile {
    public static void main(String[] args) {
//        var scanner = new Scanner(System.in);
//        var name = "";
//        while (!name.equals("exit")){
//            System.out.println("informe um nome");
//            name = scanner.next();
//            System.out.println(name);
//        }
//        var scanner = new Scanner(System.in);
//        var name = "";
//        while (true){
//            System.out.println("informe um nome");
//            name = scanner.next();
//            System.out.println(name);
//
//            if (name.equalsIgnoreCase("exit")) break;
//        }

        /// ////////// do while roda pelomenos uma vez. While pode não executar
//        var scanner = new Scanner(System.in);
//        var name = "exit";
//        do {
//            System.out.println("informe um nome");
//            name = scanner.next();
//            System.out.println(name);
//        } while (!name.equalsIgnoreCase("exit"));

        var scanner = new Scanner(System.in);
        var name = "exit";
        while (!name.equalsIgnoreCase("exit")) {
            System.out.println("informe um nome");
            name = scanner.next();
            System.out.println(name);

        }

    }
}
