package com.carrental.service;

import com.carrental.types.AutoType;
import com.google.common.base.Preconditions;

/**
 * Created by devi on 6/8/2017.
 */
public class DriverDetail {
    private String name;
    private AutoType type;
    private Integer commission;

    public DriverDetail(String name, AutoType type, Integer commission) {
        Preconditions.checkNotNull(name, "Driver Name cannot be null");
        Preconditions.checkNotNull(type, "Vehicle Tupe is a required field");
        Preconditions.checkArgument((commission>0 && commission<4), "Driver comission rate is valid between 1-3%");
        this.name = name;
        this.type = type;
        this.commission = commission;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AutoType getType() {
        return type;
    }

    public void setType(AutoType type) {
        this.type = type;
    }

    public Integer getCommission() {
        return commission;
    }

    public void setCommission(Integer commission) {
        this.commission = commission;
    }
}
