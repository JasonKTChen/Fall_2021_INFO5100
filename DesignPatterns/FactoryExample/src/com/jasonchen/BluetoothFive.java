package com.jasonchen;

public class BluetoothFive implements IBluetooth{
    public String name = "";
    public BluetoothFive (){
        this.name = "Five";
    }
    @Override
    public void pair(IBluetooth bt) {
        System.out.println("Pair with " + bt.name);
    }

    @Override
    public void unPair(IBluetooth bt) {
        System.out.println("unpair with " + bt.name);
    }

    @Override
    public void sendData(IBluetooth bt, String str) {
        System.out.println("Sending data with " + bt.name);
    }

    @Override
    public String receiveData(IBluetooth bt) {
        return null;
    }
}
