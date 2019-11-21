import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

public class FuelConsumptionOptionD {

    private Double calculateFuelConsumption(Double distance, Double tank) {
        return (tank / distance) * 100;
    }

    private Double calculateFuelConsumption(Integer distance, Integer tank) {
        Double fuelConsumptionFormula = (Double.valueOf(tank) / Double.valueOf(distance)) * 100; // тут тоже можно заменить "Double fuelConsumptionFormula =" на "return"
        System.out.println(tank);
        System.out.println(distance);
        System.out.println(fuelConsumptionFormula);
        return fuelConsumptionFormula;
    }

    @Test
    public void showFuelConsumption() {
        DecimalFormat formatter = new DecimalFormat("0.00");
        System.out.println("Fuel consumption in case A is: " + formatter.format(calculateFuelConsumption(739.0, 65.0)) + " L/100 km");
        System.out.println("Fuel consumption in case B is: " + formatter.format(calculateFuelConsumption(1300, 50)) + " L/100 km");
    }
}
