package com.jasonchen;

public interface iImplementBluetooth {
    void pair(String deviceUUID);
    void unpair(String deviceUUID);
    void sendString(String str);
}
