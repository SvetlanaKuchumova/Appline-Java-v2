package presents;

public class Chocolate extends Present{
    private String percentageCocoa;

    public Chocolate(String name, double weigth, double price, String percentageCocoa) {
        super(name, weigth, price);
        this.percentageCocoa = percentageCocoa;
    }

    public Chocolate() {}

    public String getPercentageCocoa() {
        return percentageCocoa;
    }

    public void setPercentageCocoa(String percentageCocoa) {
        this.percentageCocoa = percentageCocoa;
    }

    @Override
    public String toString() {
        return "Шоколад " + super.getName() + ", тип " + percentageCocoa + ", вес " + super.getWeigth() + " кг";
    }
}
