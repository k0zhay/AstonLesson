import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

public class Task4 {
    protected static Collection<Student> students = Arrays.asList(
            new Student("Дмитрий", 17, Sex.MAN),
               new Student("Максим", 20, Sex.MAN),
               new Student("Екатерина", 20, Sex.WOMAN),
               new Student("Михаил", 28, Sex.MAN)
       );

    protected enum Sex {
        MAN,
        WOMAN
    }

    protected static class Student {
        private final String name;
        private final Integer age;
        private final Sex gender;

        public Student(String name, Integer age, Sex gender) {
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

        public Sex getGender() {
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
            if (!(o instanceof  Student)) return false;
            Student student= (Student) o;
            return Objects.equals(name, student.name) &&
                    Objects.equals(age, student.age) &&
                    Objects.equals(gender, student.gender);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, gender);
        }
    }
}
