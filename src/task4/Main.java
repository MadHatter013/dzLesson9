package task4;

public class Main {
    public static void main(String[] args) {
        Fruit fruit = new Pear(4, 3.74);
        Fruit fruit1 = new Pear(4, 3.74);
        Fruit fruit2 = new Apple(1, 8.2);
        Fruit fruit3 = new Apricot(14, 2);


        System.out.println("Общая стоимость всех проданных яблок: " + Apple.getTotalCost());
        System.out.println("Общая стоимость всех проданных груш: " + Pear.getTotalCost());
        System.out.println("Общая стоимость всех проданных абрикос: " + Apricot.getTotalCost());

        System.out.println("Общая стоимость всех проданных фруктов: " + Fruit.getTotalCost());

    }
}
