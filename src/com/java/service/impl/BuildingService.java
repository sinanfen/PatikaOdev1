package service.impl;

import data.Building;
import data.House;
import data.Summerhouse;
import data.Villa;
import service.IBuildingService;
import util.ITypeUtility;
import util.TypeUtility;

import java.math.BigDecimal;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class BuildingService implements IBuildingService {

    protected ITypeUtility typeUtility;
    private int countOfBuildingTypes = 3;

    public BuildingService() {
        this.typeUtility = new TypeUtility();
    }

    /*
    gets total price of normal type Houses
     */
    @Override
    public BigDecimal getTotalPriceOfHouses() {
        List<House> houseList = this.typeUtility.getHouseList();
        BigDecimal sum = BigDecimal.valueOf(0);
        for (House house : houseList) {
            BigDecimal price = house.getPrice();
            sum = sum.add(price);
        }
        return sum;
    }

    @Override
    public BigDecimal getTotalPriceOfVillas() {
        List<Villa> villaList = this.typeUtility.getVillaList();
        BigDecimal sum = BigDecimal.valueOf(0);
        for (Villa villa : villaList) {
            BigDecimal price = villa.getPrice();
            sum = sum.add(price);
        }
        return sum;
    }

    @Override
    public BigDecimal getTotalPriceOfSummerhouses() {
        List<Summerhouse> summerhouseList = this.typeUtility.getSummerhouseList();
        BigDecimal sum = BigDecimal.valueOf(0);
        for (Summerhouse summerhouse : summerhouseList) {
            BigDecimal price = summerhouse.getPrice();
            sum = sum.add(price);
        }
        return sum;
    }

    @Override
    public BigDecimal getTotalPriceOfAllBuildings() {
        BigDecimal sum = BigDecimal.valueOf(0)
                .add(getTotalPriceOfHouses())
                .add(getTotalPriceOfVillas())
                .add(getTotalPriceOfSummerhouses());
        return sum;
    }

    @Override
    public OptionalDouble getAverageSquareMetersOfHouses() {
        List<House> houseList = this.typeUtility.getHouseList();
        OptionalDouble average = OptionalDouble.of(houseList.stream().filter(x -> x.getSquareMeters() > 0)
                .mapToDouble(x -> x.getSquareMeters()).average().orElse(0));
        return average;
    }

    @Override
    public OptionalDouble getAverageSquareMetersOfVillas() {
        List<Villa> villaList = this.typeUtility.getVillaList();
        OptionalDouble average = OptionalDouble.of(villaList.stream().filter(x -> x.getSquareMeters() > 0)
                .mapToDouble(x -> x.getSquareMeters()).average().orElse(0));
        return average;
    }

    @Override
    public OptionalDouble getAverageSquareMetersOfSummerhouses() {
        List<Summerhouse> summerhouseList = this.typeUtility.getSummerhouseList();
        OptionalDouble average = OptionalDouble.of(summerhouseList.stream().filter(x -> x.getSquareMeters() > 0)
                .mapToDouble(x -> x.getSquareMeters()).average().orElse(0));
        return average;
    }

    @Override
    public OptionalDouble getAverageSquareMetersOfAllBuildings() {
        OptionalDouble average = OptionalDouble.of((
                getAverageSquareMetersOfHouses().getAsDouble() +
                        getAverageSquareMetersOfSummerhouses().getAsDouble() +
                        getAverageSquareMetersOfVillas().getAsDouble() / countOfBuildingTypes));
        return average;
    }

    @Override
    public List<Building> getBuildingByFilter(int room, int saloon) {
        List<Building> buildings = this.typeUtility.getBuildingList();

        List<Building> result = buildings.stream().filter(x -> x.getRoom() == room && x.getSaloon() == saloon).collect(Collectors.toList());
        if (result.isEmpty()) {
            throw new IllegalArgumentException("There is no building with this room and saloon number");
        }
        ;
        return result;
    }
}
