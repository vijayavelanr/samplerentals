package com.carrental.types;

import com.carrental.types.Auto;

import java.util.List;

/**
 * Created by devi on 6/8/2017.
 */
public interface Rentals {
    // Adding Auto for Rental Service
    boolean addAutoToRentalService(Auto auto);

    // Withdraw Auto Rental Service
    boolean withdrawAutoFromService(Auto auto);

    List<String> getAvailableAutos();

    Auto rentAuto();
}
