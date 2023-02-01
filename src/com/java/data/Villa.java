package data;

import java.math.BigDecimal;

public class Villa extends Building {
    public Villa(BigDecimal price, int squareMeters, int room, int saloon) {
        super(price, squareMeters, room, saloon);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(BigDecimal price) {
        super.setPrice(price);
    }

    @Override
    public int getSquareMeters() {
        return super.getSquareMeters();
    }

    @Override
    public void setSquareMeters(int squareMeters) {
        super.setSquareMeters(squareMeters);
    }

    @Override
    public int getRoom() {
        return super.getRoom();
    }

    @Override
    public void setRoom(int room) {
        super.setRoom(room);
    }

    @Override
    public int getSaloon() {
        return super.getSaloon();
    }

    @Override
    public void setSaloon(int saloon) {
        super.setSaloon(saloon);
    }

}
