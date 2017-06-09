package com.carrental.types;

/**
 * Created by devi on 6/8/2017.
 */
public interface Auto {
    public AutoType getType();
    public String getAutoMake();
    public String getModelName();
    public AutoStatus getAutoStatus();
    public int[] getAutoLocation();

}
