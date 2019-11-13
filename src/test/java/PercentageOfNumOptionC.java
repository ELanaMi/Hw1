import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PercentageOfNumOptionC {

    private Double divide(Integer x) {
        Double y = 100.0;
        return x / y;
    }

    @Test
    public void showDivide() {
        Double caseA = divide(7);
        Double caseB = divide(100);

        System.out.println(" 1% of number in case A is:" + caseA + "\n 1% of number in case B is:" + caseB);

        Assertions.assertEquals(0.07, caseA, "Wrong!");
        Assertions.assertEquals(1, caseB, "Wrong!");
    }
}
