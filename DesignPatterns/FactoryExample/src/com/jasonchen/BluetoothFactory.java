package com.jasonchen;

public class BluetoothFactory {
    public static IBluetooth createBluetoothDevice(String str){
        switch (str.toLowerCase()){
            case "five":
                BluetoothFive five = new BluetoothFive();
                return five;
            case "four":
                BluetoothFour four = new BluetoothFour();
                return four;
            default:
                return null;
        }
    }
}
