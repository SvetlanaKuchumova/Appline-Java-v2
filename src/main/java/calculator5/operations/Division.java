package calculator5.operations;

public class Division {

    public Division(double x, double y) throws ArithmeticException {
        double res = x / y;

        if (y == 0) {
            try {
                throw new java.lang.ArithmeticException();
            } catch (ArithmeticException e) {
                System.out.println("На ноль делить нелья!");
            }
        } else {
            System.out.printf("%.4f / %.4f = %.4f ", x, y, res);
        }
    }
}
