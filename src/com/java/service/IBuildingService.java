package service;

import data.Building;

import java.math.BigDecimal;
import java.util.List;
import java.util.OptionalDouble;

public interface IBuildingService {
    BigDecimal getTotalPriceOfHouses();
    BigDecimal getTotalPriceOfVillas();
    BigDecimal getTotalPriceOfSummerhouses();
    BigDecimal getTotalPriceOfAllBuildings();
    OptionalDouble getAverageSquareMetersOfHouses();
    OptionalDouble getAverageSquareMetersOfVillas();
    OptionalDouble getAverageSquareMetersOfSummerhouses();
    OptionalDouble getAverageSquareMetersOfAllBuildings();
    List<Building> getBuildingByFilter(int room, int saloon);
}
