import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PercentageOfNumOptionB {

    private Double multiply(Integer x) {
        Double y = 0.01;
        return x * y;
    }
    @Test
    public void showMultiply() {
        Double caseA = multiply(7);
        Double caseB = multiply(100);

        System.out.println(" 1% of number in case A is:" + caseA + "\n 1% of number in case B is:" + caseB);

        Assertions.assertEquals(0.07, caseA, "Wrong!");
        Assertions.assertEquals(1, caseB, "Wrong!");
    }
}

