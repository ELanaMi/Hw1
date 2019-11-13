import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

public class FuelConsumptionOptionB {

    private Double fuelConsumptionFormula(Double x, Double y, Double z) {
        Double way = x;
        Double tank = y;
        Double distance = z;

        Double fuelConsumption = (tank / way) * distance;
        return fuelConsumption;
    }

@Test
    public void showFuelConsumption() {

        DecimalFormat formatter = new DecimalFormat("0.000");

        Double caseA = fuelConsumptionFormula(400.50, 60.0,100.0);
        System.out.println(" Fuel consumption for 100 km is: " + formatter.format(caseA) + " L");

        Double distanceX = 10.0;
        Double caseB = fuelConsumptionFormula(400.50,60.0, distanceX);
        System.out.println(" Fuel consumption for " + distanceX + " km is " + formatter.format(caseB) + " L");

    }
}
