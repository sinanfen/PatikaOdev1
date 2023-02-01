package src;

import service.impl.BuildingService;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BuildingService buildingService = new BuildingService();
        printTotalPrice("Houses", buildingService.getTotalPriceOfHouses().toPlainString());
        printTotalPrice("Villas", buildingService.getTotalPriceOfVillas().toPlainString());
        printTotalPrice("Summerhouses", buildingService.getTotalPriceOfSummerhouses().toPlainString());
        printTotalPrice("All buildings", buildingService.getTotalPriceOfAllBuildings().toPlainString());

        printAverageSquareMeters("House", buildingService.getAverageSquareMetersOfHouses().toString());
        printAverageSquareMeters("Villa", buildingService.getAverageSquareMetersOfVillas().toString());
        printAverageSquareMeters("Summerhouse", buildingService.getAverageSquareMetersOfSummerhouses().toString());
        printAverageSquareMeters("All buildings", buildingService.getAverageSquareMetersOfAllBuildings().toString());


        System.out.println("~~~~~~~~~~~~~~~~~~Filter by room and saloon numbers~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Enter a room number: \n");
        boolean validInput;
        Scanner input = null;

        do {
            validInput = true;
            try {
                input = new Scanner(System.in);
            } catch (NumberFormatException ex) {
                validInput = false;
                System.out.println("Please enter a valid number.");
            }
        } while (!validInput);

        int roomFilter = input.nextInt();
        System.out.println("Enter a saloon number: \n");
        int saloonFilter = input.nextInt();
        System.out.println("~~~~~~~~~~~~~~~~~~Your results~~~~~~~~~~~~~~~~~~~~");
        System.out.println(buildingService.getBuildingByFilter(roomFilter, saloonFilter));
    }

    //Prints a building's total price data.
    private static void printTotalPrice(String buildingType, String result) {
        System.out.println("Total price of " + buildingType + " is: " + result);
    }

    //Prints a building's average squaremeters data.
    private static void printAverageSquareMeters(String buildingType, String result) {
        System.out.println("Average squaremeters of " + buildingType + " is: " + result);
    }
}