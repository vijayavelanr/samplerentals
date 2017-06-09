package com.carrental.infra;

import com.carrental.service.LightWeightRentals;
import com.carrental.service.RentalsManager;

/**
 * Created by devi on 6/8/2017.
 */
public class RentalServiceAdmin {


    public static void main(String[] args) {

        LightWeightRentals lightWeightRentals = new LightWeightRentals();
        RentalsManager<LightWeightRentals> service = new RentalsManager<>(lightWeightRentals);
        service.browseAvailableAutos();


    }

}
