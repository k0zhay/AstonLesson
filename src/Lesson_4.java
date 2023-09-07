
public class Lesson_4 {
    public static void main(String[] args) {
        // Создание массива сотрудников
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer",
                "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Petrov Petr", "Manager",
                "petroweech@mail.com", "891234567", 40000, 50);
        persArray[2] = new Person("Yanina Yana", "Engineer",
                "yanka@yandex.ru", "897654321", 20000, 21);
        persArray[3] = new Person("Sergeev Sergei", "Lead Engineer",
                "sirgay@mail.ru", "893168954", 50000, 43);
        persArray[4] = new Person("Nicolaev Igor", "Artist",
                "drinkerForLove@mail.ru", "89510978", 111111, 63);

        // Вывод данных сотрудников старше 40 лет
        for (int i = 0; i < 5; i++) {
            if (persArray[i].age > 40) {
                persArray[i].info();
            }
        }

        // Пример работы c данными из подкласса Attraction из класса Park
        Park.Attraction carousel = new Park().new Attraction();
        carousel.name = "Карусель";
        carousel.price = 200;
        carousel.workTime = "11:00 - 20:00";
        carousel.info();

    }
}
