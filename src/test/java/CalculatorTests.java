import calculator5.operations.Addition;
import calculator5.operations.Division;
import calculator5.operations.Multiplication;
import calculator5.operations.Subtraction;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTests {

    @Test
    public void CheckAddDouble() {
        Addition add = new Addition(16.2, -1.2);
        Assert.assertEquals("Сумма считается неверно", 15, add.add(), 0);
    }

    @Test
    public void CheckSubDouble() {
        Subtraction sub = new Subtraction(11.2, -1.8);
        Assert.assertEquals("Разность считается неверно", 13, sub.sub(), 0);
    }

    @Test
    public void CheckMultDouble() {
        Multiplication mult = new Multiplication(11.11, 3);
        Assert.assertEquals("Произведение считается неверно", 33.33, mult.mult(), 0);
    }

    @Test
    public void CheckDivDouble() {
        Division div = new Division(15, 3);
        Assert.assertEquals("Деление считается неверно", 5, div.div(), 0);
    }
}
