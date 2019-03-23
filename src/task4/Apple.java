package task4;

public class Apple extends Fruit {
    private static double totalCost = 0;
    private double price;

    public Apple(double weight, double price) {
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
        Apple.totalCost = totalCost;
    }

    @Override
    public double cost() {
        return price * getWeight();
    }
}
