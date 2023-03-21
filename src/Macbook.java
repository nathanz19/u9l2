public class Macbook extends Apple{
    private String model;

    public Macbook(int numProducts, String model) {
        super(numProducts);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void code() {
        System.out.println("You have coded a game on your Macbook " + getModel() + ".");
    }
}
