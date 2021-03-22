package presents;

public class Candy extends Present{
    private String filling; //начинка

    public Candy(String name, double weigth, double price, String filling) {
        super(name, weigth, price);
        this.filling = filling;
    }
    public String getFilling() {
        return filling;
    }

    public Candy() { }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    @Override
    public String toString() {
        return "Конфеты " + super.getName() + ", начинка " + filling + ", вес " + super.getWeigth() + " кг";
    }
}
