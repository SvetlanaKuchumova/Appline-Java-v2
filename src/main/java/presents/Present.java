package presents;

public class Present {
    private String name;
    private double weigth;
    private double price;

    public Present() {}

    public Present(String name, double weigth, double price) {
        this.name = name;
        this.weigth = weigth;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
