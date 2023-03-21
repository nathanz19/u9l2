public class Iphone extends Apple {
    String model = "";
    public Iphone(int numProducts, String model) {
        super(numProducts);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void call() {
        System.out.println("You have called someone with your Iphone " + getModel() + ".");
    }
}
