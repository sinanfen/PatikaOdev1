package data;

import java.math.BigDecimal;

public class BaseEntity {

    private BigDecimal price;
    private int squareMeters;
    private int room;
    private int saloon;

    public BaseEntity(BigDecimal price, int squareMeters, int room, int saloon) {
        this.price = price;
        this.squareMeters = squareMeters;
        this.room = room;
        this.saloon = saloon;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(int squareMeters) {
        this.squareMeters = squareMeters;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public int getSaloon() {
        return saloon;
    }

    public void setSaloon(int saloon) {
        this.saloon = saloon;
    }
}
