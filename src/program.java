import java.util.Scanner;

import controller.Controller;

public class program {
    public static void main(String[] args) {
        // Сделать калькулятор комплексных чисел

        System.out.println("Добро пожаловать в калькулятор комплекcных чисел!");

        Controller controller = new Controller();

        double a = controller.setAfor1();
        double b = controller.setBfor1();
        double c = controller.setAfor2();
        double d = controller.setBfor2();

        System.out.println("Введите что будем делать ( + / - / * / / ? ");
        Scanner scanner1 = new Scanner(System.in);
        String op = scanner1.nextLine();

        switch (op) {
            case "+" -> controller.summation(a, b, c, d);
            case "-" -> controller.subtraction(a, b, c, d);
            case "*" -> controller.multiplication(a, b, c, d);
            case "/" -> controller.division(a, b, c, d);
        }
    }
}