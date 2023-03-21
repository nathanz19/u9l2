public class Apple {
    private int numProducts;

    public Apple(int numProducts) {
        this.numProducts = numProducts;
    }

    public int getNumProducts() {
        return numProducts;
    }

    public void makeProduct() {
        numProducts++;
        System.out.println("You made 1 product! You now have " + getNumProducts() + " product(s) in inventory.");
    }

    public void sellProduct() {
        if (numProducts <= 0) {
            System.out.println("You do not have enough to sell...");
        } else {
            numProducts--;
            System.out.println("You sold 1 product! You now have " + getNumProducts() + " product(s) in inventory.");
        }
    }
}
