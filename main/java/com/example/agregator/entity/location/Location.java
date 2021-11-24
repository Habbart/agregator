package com.example.agregator.entity.location;

public class Location {
    protected long placeId;

    protected String flightNumber;

    protected String terminalNumber;

    protected String trainNumber; //Номер поезда, если место начала поездки ж/д вокзал

    protected String trainCarriageNumber; //Номер вагона поезда, если место начала поездки ж/д вокзал

    protected String address;

    protected String location; //координаты

    protected String time; // время вылета/прилета, Зависит от типа места отправления/назначения (аэропорт, ж/д вокзал, адрес)
}
