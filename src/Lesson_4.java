
public class Lesson_4 {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer",
                "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Petrov Petr", "Manager",
                "petpetrych@mail.com", "891234567", 40000, 50);
        persArray[2] = new Person("Yanina Yana", "Engineer",
                "yanka@yandex.ru", "897654321", 20000, 21);
        persArray[3] = new Person("Sergeev Sergei", "Lead Engineer",
                "sirgay@mail.ru", "893168954", 50000, 43);
        persArray[4] = new Person("Nicolaev Igor", "Artist",
                "drinkerForLove@mail.ru", "89510978", 111111, 63);

        Person.info(persArray[4]);
    }


}
