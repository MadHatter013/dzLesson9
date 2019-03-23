package task4;

public abstract class Fruit {
    private static double totalCost;
    private double weight;

    public double getWeight() {
        return weight;
    }

    public static double getTotalCost() {
        return totalCost;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static void setTotalCost(double cost) {
        Fruit.totalCost = Fruit.totalCost + cost;
    }

    public Fruit(double weight) {
        this.weight = weight;
    }

    public void printManufacturerInfo() {
        System.out.println("Made in Ukraine");
    }

    public abstract double cost();
}
