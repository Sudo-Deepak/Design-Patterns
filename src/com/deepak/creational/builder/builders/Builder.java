package com.deepak.creational.builder.builders;

import com.deepak.creational.builder.cars.CarType;
import com.deepak.creational.builder.components.Engine;
import com.deepak.creational.builder.components.GPSNavigator;
import com.deepak.creational.builder.components.Transmission;
import com.deepak.creational.builder.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setCarType(CarType type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
