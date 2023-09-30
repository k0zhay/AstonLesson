/*
В реалиях задачи Fruit, наверное, было бы удобнее реализовать в качестве
интерфейса, а в Apple и Orange задать свои weight и переопределить getWeight()
*/
package fruits;

public class Fruit {
    float weight;

    public Fruit() {}

    public float getWeight() {
        return this.weight;
    }
}
