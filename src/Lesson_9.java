import java.util.ArrayList;
import java.util.Arrays;

public class Lesson_9 {
    public static void main(String[] args) {
        System.out.println("Результат выполнения задания №1");
        Task1.EvenInRandArray();


        System.out.println("\nРезультат выполнения задания №2");
        ArrayList<String> highAndLoad = new ArrayList<>
                (Arrays.asList("Highload", "High", "Load", "Highload"));
        ArrayList<String> empty = new ArrayList<>();
        Task2.countOfWord(highAndLoad, "High");
        //Task2.firstWord(highAndLoad);
        //Task2.firstWord(empty);


        System.out.println("\nРезультат выполнения задания №3");
        ArrayList<String> notSorted = new ArrayList<>
                (Arrays.asList("f10", "f15", "f2", "f4", "f4"));
        Task3.showSorted(notSorted);


        /*
        Для единообразия оформления работы и возможности в классе Lesson_9
        использовать данные из Task4, уровни доступа в Task4 изменены:
        вместо private поставлен protected
        */
        System.out.println("\nРезультат выполнения задания №4");
        // Сосчитаем количество мужчин
        long countOfMen = Task4.students.stream().
                filter(stud -> stud.getGender() == Task4.Sex.MAN).count();
        // Сосчитаем суммарный возраст мужчин
        double totalAge = Task4.students.stream().
                filter(stud -> stud.getGender() == Task4.Sex.MAN).
                mapToInt(stud -> stud.getAge()).sum();
        System.out.printf("Средний возраст мужчин-студентов равен %.1f\n",
                totalAge / countOfMen);

        // Посмотрим, каким студентам грозит получение повестки
        Task4.students.stream().
                filter(stud -> stud.getGender() == Task4.Sex.MAN &&
                        stud.getAge() >= 18 && stud.getAge() <= 27).
                forEach(stud -> System.out.println(stud.getName() +
                        " может получить повестку"));


        System.out.println("\nРезультат выполнения задания №5");

    }
}
