package store.part1;

public class Main {
    public static void main(String[] args) {
        Product[] productElectronics = {
                new Product("Computer",4000,8.2),
                new Product("Headphones",800,9.0),
                new Product("Power bank",200,4.2),
                new Product("Charger",360,0.0),
        };
        Category electronics = new Category("Electronics",productElectronics);

        Basket basket = new Basket(productElectronics);

    }
}
