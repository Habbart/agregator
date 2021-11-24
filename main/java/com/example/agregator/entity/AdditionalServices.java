package com.example.agregator.entity;

public enum AdditionalServices {
    FARE_ON_TOLL_ROAD(1),
    ADDITIONAL_CHANGE_ITINERARY(2),
    ADDITIONAL_WAIT(3);

    private final int fieldNumber;

    public int getFieldNumber() {
        return fieldNumber;
    }

    AdditionalServices(int fieldNumber) {
        this.fieldNumber = fieldNumber;
    }
}
