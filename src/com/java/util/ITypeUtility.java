package util;

import data.Building;
import data.House;
import data.Summerhouse;
import data.Villa;

import java.math.BigDecimal;
import java.util.List;

public interface ITypeUtility {
    List<House> getHouseList();

    List<Villa> getVillaList();

    List<Summerhouse> getSummerhouseList();

    List<Building> getBuildingList();

    private Building createBuilding(BigDecimal price, int squareMeters, int room, int saloon) {
        return null;
    }

    private Villa createVilla(BigDecimal price, int squareMeters, int room, int saloon) {
        return null;
    }

    private House createHouse(BigDecimal price, int squareMeters, int room, int saloon) {
        return null;
    }

    private Summerhouse createSummerhouse(BigDecimal price, int squareMeters, int room, int saloon) {
        return null;
    }
}
