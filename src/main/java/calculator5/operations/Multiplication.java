package calculator5.operations;

public class Multiplication {

    private double x;
    private double y;

    public Multiplication(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double mult(){
        return x * y;
    }

    @Override
    public String toString() {
        return x + " * " + y + " = " + mult() + "";
    }
}
