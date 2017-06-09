package com.carrental.service;

import com.carrental.service.DriverDetail;
import com.carrental.service.LightWeightAuto;
import com.carrental.types.Auto;
import com.carrental.types.AutoGrade;
import com.carrental.types.AutoType;
import com.carrental.types.Rentals;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by devi on 6/8/2017.
 */
public class RentalsManager<T extends Rentals> {

    private final ConcurrentHashMap<AutoGrade, Integer> priceManager = new ConcurrentHashMap<AutoGrade, Integer>();
    //private final List<String> cache;
    private final T rentals;

    public RentalsManager(T rentals) {
        this.rentals = rentals;
        setReferenceDataSetup(rentals);
    //    cache = rentals.getAvailableAutos();
    }

    private void setReferenceDataSetup(T r) {
        // Setting Car Rental Price by their Grade
        priceManager.put(AutoGrade.GRADE1, 10);
        priceManager.put(AutoGrade.GRADE2, 8);
        priceManager.put(AutoGrade.GRADE3, 6);
        priceManager.put(AutoGrade.GRADE4, 5);

        // Setup 1 Initial LightWeightAuto
        DriverDetail driverDetail1 = new DriverDetail("Vijay", AutoType.LIGHT, 1);
        LightWeightAuto lightWeightAuto1 = new LightWeightAuto(AutoType.LIGHT, "honda", "civic", driverDetail1);

        r.addAutoToRentalService(lightWeightAuto1);

        // Setup 2 Initial LightWeightAuto
        DriverDetail driverDetail2 = new DriverDetail("Madesh", AutoType.LIGHT, 2);
        LightWeightAuto lightWeightAuto2 = new LightWeightAuto(AutoType.LIGHT, "toyota", "corolla", driverDetail2);

        r.addAutoToRentalService(lightWeightAuto2);

        // Setup 2 Initial LightWeightAuto
        DriverDetail driverDetail3 = new DriverDetail("Devi", AutoType.LIGHT, 2);
        LightWeightAuto lightWeightAuto3 = new LightWeightAuto(AutoType.LIGHT, "toyota", "camry", driverDetail3);

        r.addAutoToRentalService(lightWeightAuto3);
    }

    public void browseAvailableAutos() {

        List<String> cache = rentals.getAvailableAutos();
        int count = 0;

        System.out.println("Available Rental Autos: ");
        for (String car :
                cache) {
            System.out.printf("Choose Option %d for %s. \n", count++, car);
        }
      }
}
