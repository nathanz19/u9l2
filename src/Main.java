public class Main {
    public static void main(String[] args) {
        //Test Apple
        Apple appleInc = new Apple(10);
        appleInc.makeProduct();
        appleInc.sellProduct();
        //Test Iphone
        Iphone ip = new Iphone(50,"13");
        ip.call();
        ip.makeProduct();
        ip.sellProduct();
        //Test Macbook
        Macbook mb = new Macbook(100, "Pro 23 13\" M2");
        mb.code();
        mb.makeProduct();
        mb.sellProduct();
    }
}