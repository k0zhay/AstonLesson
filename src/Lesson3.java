/*
В этом файле я попробовал оформить вывод результатов заданий
в удобоваримом виде. Надеюсь, получилось.
 */

import java.util.Arrays;

public class Lesson3 {
    public static void main(String[] args) {
        String result = "Результат выполнения задания №";
        // Задание №1:
        System.out.println(result + "1:\n" + methods.isSumWithin(5, 15) + "\n");
        // Задание №2:
        System.out.println(result + "2:");
        methods.isPositive(0);
        System.out.println();
        // Задание №3:
        System.out.printf(result + "3:\n%b \n\n", methods.isNegative(-1));
        // Задание №4:
        System.out.println(result + "4:");
        methods.printText("Я дважды повторять не стану!", 5);
        System.out.println();
        // Задание №5:
        System.out.printf(result + "5:\n%b \n\n", methods.isLeapYear(2001));
        // Задание №6:
        System.out.println(result + "6:");
        methods.replaceOneZero();
        System.out.println();
        // Задание №7:
        System.out.println(result + "7:");
        methods.arrHundred();
        System.out.println();
        // Задание №8:
        System.out.println(result + "8:");
        methods.lessThanSix();
        System.out.println();
        // Задание №9:
        System.out.println(result + "9:");
        methods.fillDiagonal(6);
        System.out.println();
        // Задание №10:
        System.out.printf(result + "10:\n%s",
                Arrays.toString(methods.arrCreate(3, 999)));
    }
}



