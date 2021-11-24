package com.example.agregator.entity.car;

public enum CarType {
    ECONOM(1),
    STANDART(2),
    COMFORT(3),
    REPRESENTATIVE(4),
    SMALL_BUS(5),
    MINIVAN(6),
    BUS(7),
    MINIVAN_V(8),
    OUTROADER(11),
    BUSINESS(12),
    TESLA(27),
    KOMFORT_PD(28),
    STANDART_PD(29),
    BUSINESS_PD(30);



    private final int fieldNumber;

    CarType(int fieldNumber) {
        this.fieldNumber = fieldNumber;
    }

    public int getFieldNumber() {
        return fieldNumber;
    }
}
