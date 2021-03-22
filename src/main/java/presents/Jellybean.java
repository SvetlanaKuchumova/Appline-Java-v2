package presents;

public class Jellybean extends Present{
    private String color;

    public Jellybean(String name, double weigth, double price, String color) {
        super(name, weigth, price);
        this.color = color;
    }

    public Jellybean() {}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Мармелад " + super.getName() + ", цвет " + color + ", вес " + super.getWeigth() + " кг";
    }
}
