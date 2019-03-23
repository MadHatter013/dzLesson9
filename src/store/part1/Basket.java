package store.part1;

public class Basket {
    Product[] purchasedGoods;

    public Basket(Product[] purchasedGoods) {
        this.purchasedGoods = purchasedGoods;
    }


    public Product[] getPurchasedGoods() {
        return purchasedGoods;
    }

    public void setPurchasedGoods(Product[] purchasedGoods) {
        this.purchasedGoods = purchasedGoods;
    }

}
