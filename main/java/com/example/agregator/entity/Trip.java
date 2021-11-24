package com.example.agregator.entity;

import com.example.agregator.entity.additional_services.AbstractAdditionalService;

import java.util.List;

public class Trip {
    private  int priceId;

    private List<Location> startLocation;

    private List<Location> finishLocation;

    private List<Passanger> passangers;

    private List<Passanger> additionalLocations;

    private int passangersNumber;

    private String textTablet;

    private String comment;

    private Confirmation additionalChangeItinerary;

    private Confirmation additionalWait;

    private Confirmation fareOnTollRoad;

    private boolean[] sendParams;

    private List<AbstractAdditionalService> additionalPaymentInfo;
}
