package calculator5.operations;

public class Subtraction {

    private double x;
    private double y;

    public Subtraction(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double sub(){
        return x - y;
    }

    @Override
    public String toString() {
        return x + " - " + y + " = " + sub() + "";
    }
}
