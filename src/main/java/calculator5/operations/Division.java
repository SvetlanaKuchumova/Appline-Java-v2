package calculator5.operations;

public class Division {

    private double x;
    private double y;

    public Division(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double div() {
            return x / y;
    }

    @Override
    public String toString() {
        if (y == 0){
            try {
                throw new java.lang.ArithmeticException();
            } catch (ArithmeticException e) {
                return "На ноль делить нелья!";
            }
        } else {
            return x + " / " + y + " = " + div() + "";
        }
    }
}
