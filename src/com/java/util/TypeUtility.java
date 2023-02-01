package util;

import data.Building;
import data.House;
import data.Summerhouse;
import data.Villa;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TypeUtility implements ITypeUtility {
    @Override
    public List<House> getHouseList() {
        BigDecimal houseType1Price = new BigDecimal("2000");
        BigDecimal houseType2Price = new BigDecimal("4000");
        BigDecimal houseType3Price = new BigDecimal("8550");
        House houseType1 = createHouse(houseType1Price, 100, 2, 1);
        House houseType2 = createHouse(houseType2Price, 200, 4, 2);
        House houseType3 = createHouse(houseType3Price, 300, 6, 3);
        List<House> houseList = new ArrayList<>();
        houseList.add(houseType1);
        houseList.add(houseType2);
        houseList.add(houseType3);
        return houseList;
    }

    @Override
    public List<Villa> getVillaList() {
        BigDecimal villaType1Price = new BigDecimal("2000");
        BigDecimal villaType2Price = new BigDecimal("4700");
        BigDecimal villaType3Price = new BigDecimal("15200");
        Villa villaType1 = createVilla(villaType1Price, 200, 5, 2);
        Villa villaType2 = createVilla(villaType2Price, 450, 7, 2);
        Villa villaType3 = createVilla(villaType3Price, 650, 9, 3);
        List<Villa> villaList = new ArrayList<>();
        villaList.add(villaType1);
        villaList.add(villaType2);
        villaList.add(villaType3);
        return villaList;
    }

    @Override
    public List<Summerhouse> getSummerhouseList() {
        BigDecimal summerHouseType1Price = new BigDecimal("3530");
        BigDecimal summerHouseType2Price = new BigDecimal("7500");
        BigDecimal summerHouseType3Price = new BigDecimal("20000");
        Summerhouse summerhouseType1 = createSummerhouse(summerHouseType1Price, 250, 5, 2);
        Summerhouse summerhouseType2 = createSummerhouse(summerHouseType2Price, 500, 7, 2);
        Summerhouse summerhouseType3 = createSummerhouse(summerHouseType3Price, 700, 9, 3);
        List<Summerhouse> summerhouseList = new ArrayList<>();
        summerhouseList.add(summerhouseType1);
        summerhouseList.add(summerhouseType2);
        summerhouseList.add(summerhouseType3);
        return summerhouseList;
    }

    @Override
    public List<Building> getBuildingList() {
        List<Building> buildingList = new ArrayList<>();
        buildingList.addAll(getHouseList());
        buildingList.addAll(getVillaList());
        buildingList.addAll(getSummerhouseList());
        return buildingList;
    }

    private House createHouse(BigDecimal price, int squareMeters, int room, int saloon) {
        return new House(price, squareMeters, room, saloon);
    }

    private Villa createVilla(BigDecimal price, int squareMeters, int room, int saloon) {
        return new Villa(price, squareMeters, room, saloon);
    }

    private Summerhouse createSummerhouse(BigDecimal price, int squareMeters, int room, int saloon) {
        return new Summerhouse(price, squareMeters, room, saloon);
    }
}
