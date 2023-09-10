package task_1;

public class Plate {
    public int food;

    public Plate(int food) {
        if (food > 0) {
            this.food = food;
        } else {
            System.out.println("Тарелка пуста!");
        }
    }
}
