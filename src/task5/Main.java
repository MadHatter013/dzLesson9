package task5;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(4);
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(1);

        System.out.println("Площадь заданого круга: " + circle.area());
        System.out.println("Длина окружности заданого крга: " + circle.circumference());

        System.out.println("Площадь заданого круга: " + circle1.area());
        System.out.println("Длина окружности заданого крга: " + circle1.circumference());

        System.out.println("Площадь заданого круга: " + circle2.area());
        System.out.println("Длина окружности заданого крга: " + circle2.circumference());
    }
}
