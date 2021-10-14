package com.jasonchen;

public class GearBox {
    boolean isAutomatic;
    int currentGear;

    public GearBox(boolean isAutomatic){
        this.isAutomatic = isAutomatic;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public int getCurrentGear() {
        return currentGear;
    }
}
