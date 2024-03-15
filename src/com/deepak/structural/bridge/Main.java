package com.deepak.structural.bridge;

import com.deepak.structural.bridge.devices.Device;
import com.deepak.structural.bridge.devices.Radio;
import com.deepak.structural.bridge.devices.Tv;
import com.deepak.structural.bridge.remotes.AdvancedRemote;
import com.deepak.structural.bridge.remotes.BasicRemote;

public class Main {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
