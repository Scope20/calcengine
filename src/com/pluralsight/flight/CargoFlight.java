package com.pluralsight.flight;

public class CargoFlight extends Flight {

    float maxCargoSpace = 1000.0f;
    float usedCargoSpace;

    public final void add1Package(float h, float w, float d) {
        float size = h * w * d;

        if (hasCargoSpace(size))
            usedCargoSpace += size;
        else
            handleNoSpace();
    }


    public CargoFlight() {}

    public CargoFlight(int flightNumber) { }

    public CargoFlight(float maxCargoSpace) {
        this.maxCargoSpace = maxCargoSpace;
    }

    public CargoFlight(int flightNumber, float maxCargoSpace) {
        this(flightNumber);
        this.maxCargoSpace = maxCargoSpace;
    }


    private boolean hasCargoSpace(float size) {
        return usedCargoSpace + size <= maxCargoSpace;
    }

    private void handleNoSpace() {
        System.out.println("Not Enough space");
    }







//    CargoFlight cf = new CargoFlight();
//
//    cf.add1Package(1.0, 2.5, 3.0);
//
//    Passenger jane = new Passenger(0,2);
//    cf.add1Passenger(jane);


//    An array of different flights!

//    Flight[] squadron = new Flight[5];
//    squadron[0] = new Flight();
//    squadron[1] = new CargoFlight();
//    squadron[2] = new CargoFlight();
//    squadron[3] = new Flight();
//    squadron[4] = new CargoFlight();
//    squadron[5] = new Flight();


}
