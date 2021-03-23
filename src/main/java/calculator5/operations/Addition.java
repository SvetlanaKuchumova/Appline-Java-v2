package calculator5.operations;

public class Addition {

    private double x;
    private double y;

    public Addition(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double add(){
        return x + y;
    }

    @Override
    public String toString() {
        return x + " + " + y + " = " + add() + "";
    }
}



