
package task2;

import java.util.Map;
import java.util.TreeMap;

/*
Примечание: далее под "Контактом" имеется в виду пара: "Имя" и "Номер"
 */

public class PhoneBook {
    /*
    На самом деле непосредственно списки names и phones не используются
    вне коллекции contacts, но решил на всякий случай добавить, т.к.
    по заданию нужен справочник, который "хранит в себе список фамилий
    и телефонных номеров"
     */
    private String[] names;
    private String[] phones;
    private Map<String, String> contacts = new TreeMap<>();

    public PhoneBook() {}

    // Конструктор для случая, когда передается два списка
    public PhoneBook(String[] names, String[] phones) {
        this.names = names;
        this.phones = phones;
        for (int i = 0; i < names.length; i++) {
            this.contacts.put(names[i], phones[i]);
        }
    }

    // Конструктор для случая, когда передается map с контактами
    public PhoneBook(Map<String, String> contacts) {
        this.contacts = contacts;
    }

    // Метод для добавления контакта (доп.номера) в справочник
    public void add(String name, String phone) {
        // Проверка на наличие такого имени в справочнике
        if (this.contacts.containsKey(name)) {
            // Добавляем новый номер через запятую
            String addPhone = this.contacts.get(name) + ", " + phone;
            this.contacts.replace(name, addPhone);
        } else {
            // Добавляем новый контакт
            this.contacts.put(name, phone);
        }
    }

    public void get(String name) {
        System.out.printf("\nНомер челоека по фамилии %s:\n%s\n",
                name, this.contacts.get(name));
    }

    public void showAllContacts() {
        System.out.println("\n" + this.contacts);
    }
}
