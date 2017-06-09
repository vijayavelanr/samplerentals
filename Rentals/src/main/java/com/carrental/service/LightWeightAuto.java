package com.carrental.service;

import com.carrental.types.Auto;
import com.carrental.types.AutoGrade;
import com.carrental.types.AutoStatus;
import com.carrental.types.AutoType;
import com.google.common.base.Preconditions;

/**
 * Created by devi on 6/8/2017.
 */
public class LightWeightAuto implements Auto {

    private AutoType type;
    private String autoMake;
    private DriverDetail driverDetail;
    private AutoStatus autoStatus;
    private AutoGrade autoGrade;
    private int[] autoLocation;
    private String modelName;

    public LightWeightAuto(AutoType type, String autoMake, String modelName, DriverDetail driverDetail) {
        Preconditions.checkNotNull(autoMake, "Auto Name cannot be null");
        Preconditions.checkNotNull(modelName, "modelName Name cannot be null");
        Preconditions.checkNotNull(type, "Driver type has to be valid type AutoType");
        Preconditions.checkNotNull(driverDetail, "Driver Information cannot be null");
        Preconditions.checkArgument(driverDetail.getType() == type, "Driver Type doesn't match");

        this.type = type;
        this.autoMake = autoMake;
        this.driverDetail = driverDetail;
        this.modelName = modelName;
        this.autoStatus = AutoStatus.NOT_IN_SERVICE;

    }

    public AutoType getType() {
        return type;
    }

    public String getAutoMake() {
        return autoMake;
    }

    @Override
    public String getModelName() {
        return modelName;
    }

    public AutoStatus getAutoStatus() {
        return autoStatus;
    }

    public int[] getAutoLocation() {
        return autoLocation;
    }

    public void setType(AutoType type) {
        this.type = type;
    }


    public void setAutoMake(String name) {
        this.autoMake = name;
    }
}
