package com.jasonchen;

public interface IBluetooth {
    void pair(IBluetooth bt);
    void unPair(IBluetooth bt);
    void sendData(IBluetooth bt,String str);
    String receiveData(IBluetooth bt);
    String name = "";
}
