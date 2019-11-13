import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

public class FuelConsumptionOptionC {

    private Double calculateFuelConsumption(Double distance,Double tank) {
        return (tank / distance) * 100;
    }

@Test
    public void showFuelConsumption() {
        Double fuelConsumption = calculateFuelConsumption(739.0,49.5);

        DecimalFormat formatter = new DecimalFormat("0.00");

        System.out.println(" Fuel consumption is: " + formatter.format(fuelConsumption) + " L/100 km");
    }
}
