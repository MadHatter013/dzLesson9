package task4;

public class Pear extends Fruit {
    private static double totalCost;
    private double price;

    public Pear(double weight, double price) {
        super(weight);
        this.price = price;
        totalCost = totalCost + cost();
        Fruit.setTotalCost(cost());
    }

    public double getPrice() {
        return price;
    }

    public static double getTotalCost() {
        return totalCost;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void setTotalCost(double totalCost) {
        Pear.totalCost = totalCost;
    }


    @Override
    public double cost() {
        return price * getWeight();
    }
}
