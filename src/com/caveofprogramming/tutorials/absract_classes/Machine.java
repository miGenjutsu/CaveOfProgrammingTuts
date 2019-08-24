package src.com.caveofprogramming.tutorials.absract_classes;

public abstract class Machine {
    private int productId;

    public int getProductId() { return productId; }

    public void setProductId(int productId) { this.productId = productId; }


    abstract void start();
    abstract void doStuff();
    abstract void shutDown();

    public void run() {
        start();
        doStuff();
        shutDown();
    }
}
