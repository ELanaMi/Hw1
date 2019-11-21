import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PercentageOfNumOptionD {

    private Double divide(Integer x) {
        Integer y = 100;
        return (double) (x / y);
    }

    @Test
    public void showDivide() {
        Double caseA = divide(7);
        Double caseB = divide(100);

        System.out.println(" 1% of number in case A is:" + caseA + "\n 1% of number in case B is:" + caseB);

        Assertions.assertEquals(0.0, caseA, "Wrong");
        Assertions.assertEquals(1.0, caseB, "Wrong");
    }
}

