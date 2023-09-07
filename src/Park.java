
public class Park {
    public class Attraction {
        String name;
        String workTime;
        int price;

        public void info() {
            System.out.println("\nНазвание: " + name +
                    "\nРабочее время: " + workTime +
                    "\nЦена: " + price);
        }
    }
}
