
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Task5 {
    // Прием логинов в виде массива строк
    public static void writeLogin(String[] loginArray) {
        Stream.of(loginArray).takeWhile(l -> l.length() != 0)
                .filter(l -> l.charAt(0) == 'f')
                .forEach(System.out::println);
    }

    // Прием логинов с клавиатуры (перегрузка метода)
    public static void writeLogin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите логин");
        String login = sc.nextLine();
        ArrayList<String> loginArray = new ArrayList<>(Arrays.asList(login));
        while (!login.equals("")) {
            System.out.println("Введите логин");
            login = sc.nextLine();
            loginArray.add(login);
        }
        loginArray.stream().takeWhile(l -> l.length() != 0)
                .filter(l -> l.charAt(0) == 'f').forEach(System.out::println);
    }
}
