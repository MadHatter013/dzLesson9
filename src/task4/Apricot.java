package task4;

public class Apricot extends Fruit {
    private static double totalCost;
    private double price;

    public Apricot(double weight, double price) {
        super(weight);
        this.price = price;
        totalCost = totalCost + cost();
        Fruit.setTotalCost(cost());
    }

    public static double getTotalCost() {
        return totalCost;
    }

    public double getPrice() {
        return price;
    }

    public static void setTotalCost(double totalCost) {
        Apricot.totalCost = totalCost;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double cost() {
        return price * getWeight();
    }
}
