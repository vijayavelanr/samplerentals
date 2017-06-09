package com.carrental.service;


import com.carrental.types.Rentals;
import com.carrental.types.Auto;

import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

/**
 * Created by devi on 6/8/2017.
 */
public class LightWeightRentals implements Rentals {
    // Subscribed Autos for Rental Services
    private CopyOnWriteArrayList<Auto> serviceFleet = new CopyOnWriteArrayList<Auto>();

    // Currently Active Rentals
    private ConcurrentLinkedQueue<Auto> activeRentals = new ConcurrentLinkedQueue<Auto>();

    // Adding Auto for Rental Service
    public boolean addAutoToRentalService(Auto auto) {
        return serviceFleet.add(auto);
    }

    // Withdraw Auto Rental Service
    public boolean withdrawAutoFromService(Auto auto) {
        return serviceFleet.remove(auto);
    }

    public List<String> getAvailableAutos() {
        List<String> autos = serviceFleet.stream().map((a) -> a.getAutoMake()+"|"+a.getModelName()).collect(Collectors.toList());
        return autos;
    }

    public Auto rentAuto() {

        return null;
    }

}
