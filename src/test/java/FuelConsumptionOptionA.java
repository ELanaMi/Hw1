import org.junit.jupiter.api.Test;
import java.text.DecimalFormat;

public class FuelConsumptionOptionA {

    private Double calculateFuelConsumption(Double distance,Double tank) {
        Double fuelConsumptionFormula = (tank / distance) * 100;
        return fuelConsumptionFormula;
    }

@Test
    public void showFuelConsumption() {
        Double caseA = calculateFuelConsumption(739.0,49.5);
        Double caseB = calculateFuelConsumption(400.50, 60.0);

        DecimalFormat formatter = new DecimalFormat("0.00");

        System.out.println(" Fuel consumption in case A is: " + formatter.format(caseA) + " L/100 km");
        System.out.println(" Fuel consumption in case B is: " + formatter.format(caseB) + " L/100 km");
    }
}
