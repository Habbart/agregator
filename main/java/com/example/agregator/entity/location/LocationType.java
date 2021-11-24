package com.example.agregator.entity.location;

public enum LocationType {

    IN_THE_CITY(1),
    AIRPORT(2),
    TRAIN_STATION(3),
    NEAR_THE_CITY(4),
    SMALL_CITY(5),
    OTHER(6),
    INSIDE_MKAD(7),
    INSIDE_KAD(8),
    CITY_MIDDLE(9),
    HOTEL(10);

    private final int filedNumber;

    LocationType(int filedNumber) {
        this.filedNumber = filedNumber;
    }

    public int getFiledNumber() {
        return filedNumber;
    }
}
