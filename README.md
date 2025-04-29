# AQA Java Course

# Лямбда и Stream API

Написать программу(-ы), позволяющую(-ие) выполнить следуюющее:

1. Для любого набора случайно-сгенерированных чисел нужно определить количество чётных чисел. 

2. Задана коллекция, состоящая из строк: «Highload», «High», «Load», «Highload». Нужно с ней выполнить следующие манипуляции:

2.1. Посчитать, сколько раз объект «High» встречается в коллекции;

2.2. Определить, какой элемент в коллекции находится на первом месте. Если мы получили пустую коллекцию, то пусть возвращается 0;

2.3. Необходимо вернуть последний элемент, если получили пустую коллекцию, то пусть возвращается 0;

3. Задана коллекция, содержащая элементы "f10", "f15", "f2", "f4", "f4". Необходимо отсортировать строки по возрастанию и добавить их в массив;

4. Создай класс со следующим содержимым:

Collection<Student> students = Arrays.asList(
new Student(""митрий", 17, Gender.MAN),
new Student("Максим", 20, Gender.MAN),
new Student("Екатерина", 20, Gender.WOMAN),
new Student("Михаил", 28, Gender.MAN)
);
private enum Gender {
MAN,
WOMAN
}
private static class Student {
private final String name;
private final Integer age;
private final Sex gender;
public Student(String name, Integer age, Gender gender) {
this.name = name;
this.age = age;
this.gender = gender;
}
public String getName() {
return name;
}
public Integer getAge() {
return age;
}
public Gender getGender() {
return gender;
}
@Override
public String toString() {
return "{" +
"name='" + name + '\'' +
", age=" + age +
", gender=" + gender +
'}';
}
@Override
public boolean equals(Object o) {
if (this == o) return true;
if (!(o instanceof Student)) return false;
Student student = (Student) o;
return Objects.equals(name, student.name) &&
Objects.equals(age, student.age) &&
Objects.equals(gender, student.gender);
}
@Override
public int hashCode() {
return Objects.hash(name, age, gender);
}
}


4.1. Необходимо узнать средний возраст студентов мужского пола;

4.2. Кому из студентов грозит получение повестки в этом году при условии, что призывной возраст установлен в диапазоне от 18 до 27 лет;

5. Нужно написать программу, которая будет принимать от пользователя ввод различных логинов. Как только пользователь введет пустую строку - программа должна прекратить приём данных от пользователя и вывести в консоль логины, начинающиеся на букву f (строчную).
